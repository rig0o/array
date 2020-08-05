lexer grammar matrizLexer;

COR1:'[';
COR2:']';
KEY1:'{';
KEY2:'}';
COMA:',';
ID:LETTER (LETTER)*;
INT:DIGIT+;

fragment
DIGIT:[0-9];
fragment
LETTER : [a-zA-Z_] ;