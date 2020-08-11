lexer grammar matrizLexer;

LCOR:'[';
RCOR:']';
LKEY:'{';
RKEY:'}';
LPAREN:'(';
RPAREN:')';
COMA:',';
EQ: '=';
PLUS:'+';
MINUS:'-';
MULT:'*';
DIV:'/';
POW:'^';

WS:[ \n\r\t]->skip;
ID:LETTER (LETTER)*;
INT:DIGIT+;
fragment
DIGIT:[0-9];
fragment
LETTER : [a-zA-Z_] ;