parser grammar matrizParser;

options { tokenVocab=matrizLexer; }


sentencias
    :   (asignacion
    |   e
    |   imprime)*
    ;
imprime
    :   IMPRIME LPAREN e RPAREN
    ;
asignacion
	:	 ID EQ e
	;

e
 	:   e POW <assoc=right>potencia      #Potencias
    |   e MULT e                        #Mult
    |   e DIV  e                        #Div
    |   e MINUS e                       #Menos
 	|   e PLUS e                        #Plus
 	|   LPAREN e RPAREN                 #Paren
 	|   transpuesta                     #Trans
 	|   arrayInitializer                #R1
    |   ID                              #Variable
    |   INT                             #Int
 	;

transpuesta
    :   TRANS'(' e')'
    ;
potencia
    : LPAREN MINUS? e RPAREN #PotenciasM
    | MINUS? e    #PotenciaA
    ;

/*asignacion
	:	tipo * '[' ']' ('[' ']')* ID EQ arrayInitializer
	;*/

arrayInitializer
    :	'{' variableInitializerList '}' #R2
    ;
variableInitializerList
    :	variableInitializer (',' variableInitializer)*  #R3
    ;
variableInitializer
    :	arrayInitializer        #Damearry
    |   INT                     #DAMEint
    ;

tipo: ID;