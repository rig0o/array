parser grammar matrizParser;

options { tokenVocab=matrizLexer; }


sentencias
    :   asignacion
    |   expression
    ;
expression
   : multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*
   ;

multiplyingExpression
   : powExpression ((MULT | DIV) powExpression)*
   ;

powExpression
   : <assoc=right> signedAtom (POW signedAtom2)*
   ;
signedAtom2
    : powExpression
    ;
signedAtom
   : PLUS signedAtom
   | MINUS signedAtom
   | atom
   ;

atom
   :    INT
   |    ID
   |    LPAREN expression RPAREN
   |    arrayInitializer
   ;




asignacion
	:	variable* '[' ']' ('[' ']')* ID EQ arrayInitializer
	;

arrayInitializer
    :	'{' variableInitializerList? ','? '}'
    ;
variableInitializerList
    :	variableInitializer (',' variableInitializer)*
    ;
variableInitializer
    :	arrayInitializer
    |   INT
    ;

variable: ID;