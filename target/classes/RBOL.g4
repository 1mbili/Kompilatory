grammar RBOL;

// Parser rules
startRule : statement* EOF;

statement : expression;

expression : assignment | print | scan | scand;

assignment : ID '=' value;

value : add | substract | mul | divide | variable;

add : variable ADD variable;
substract : variable SUBSTRACT variable;
mul : variable MUL variable;
divide : variable DIVIDE variable;

print : PRINT ID;
scan : SCAN ID;
scand : SCAND ID;

variable : ID | INT | FLOAT | DOUBLE | LONG;

SCAN : 'scan';
SCAND : 'scand';
PRINT : 'printf';
LONG : INT 'l';
FLOAT : INT '.' INT 'f';
DOUBLE : INT '.' INT;
ADD : '+';
SUBSTRACT : '-';
MUL : '*';
DIVIDE : '/';
ID : [a-zA-Z]+;
INT : [0-9]+;
STRING : '"' .*? '"';
WS : [ \t\r\n]+ -> skip;
