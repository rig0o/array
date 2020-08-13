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
TRANS:'TRASNPUESTA'|'trasnpuesta';
IMPRIME:'print'|'PRINT';
//NL:[\r\n];
WS:[ \r\n\t]->skip;
ID:LETTER (LETTER)*;
INT:DIGIT+;
fragment
DIGIT:[0-9];
fragment
LETTER : [a-zA-Z_] ;