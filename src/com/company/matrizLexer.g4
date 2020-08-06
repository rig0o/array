lexer grammar matrizLexer;
@header{package com.company;}
COR1:'[';
COR2:']';
KEY1:'{';
KEY2:'}';
COMA:',';
EQ: '=';
ID:LETTER (LETTER)*;
INT:DIGIT+;

WS:[ \n\r\t]->skip;
fragment
DIGIT:[0-9];
fragment
LETTER : [a-zA-Z_] ;