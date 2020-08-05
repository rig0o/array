parser grammar matrizParser;

options { tokenVocab=matrizLexer; }

array
	:	annotation* '[' ']' (annotation* '[' ']')*
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

annotation: ID;