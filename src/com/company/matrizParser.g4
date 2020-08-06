parser grammar matrizParser;
@header{package com.company;}
options { tokenVocab=matrizLexer; }

array
	:	annotation* '[' ']' ('[' ']')* EQ arrayInitializer
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