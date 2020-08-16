parser grammar matrizParser;

options { tokenVocab=matrizLexer; }


sentencias
    :   (asignacion ';'
    |   e ';'
    |   imprime';')*
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
 	|   TRANS '(' e')'                   #Trans
 	|   arrayInitializer                #R1
    |   ID                              #Variable
    |   INT                             #Int
 	;

potencia
    : LPAREN MINUS? e RPAREN #PotenciasM
    | MINUS? e    #PotenciaA
    ;
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