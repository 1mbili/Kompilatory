grammar RBOL;

// Parser rules
startRule : (programbody|function|structura|strukturagetterproperty|strukturasetter)* EOF;

programbody: repeatstatement | ifstatement | statement;


structura : STRUCT ID ':' structbody+ END ';' ;

strukturasetter: ID '=' ID '(' variable+ ')' ';';

strukturagetterproperty : ID '=' strukturagetter ';';

structbody : INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE;

function : function_type ID ':' fblock END ';';

function_type : FUNTION_INT | FUNTION_DOUBLE;

fblock: programbody*;


ifstatement : IF compare ':' ifbody END ';';

ifbody : programbody*;

repeatstatement : repeatheader repeatbody END ';';

repeatbody: programbody*;

statement : expression  ';';

expression : assignment | localassigment | print | scan | scand;

assignment : ID '=' value;

localassigment : LOCAL ID '=' value;

value : add | substract | mul | divide | variable;

add : variable ADD variable;
substract : variable SUBSTRACT variable;
mul : variable MUL variable;
divide : variable DIVIDE variable;

compare : ID operator ID;

operator : EQUALS | MORES | LESSS;



print : PRINT ID;
scan : SCAN ID;
scand : SCAND ID;

variable : ID | INT | FLOAT | DOUBLE | LONG;

strukturagetter : ID '.' INT;

repeatheader : REPEAT ID KROPKI;

INT_TYPE: 'int';
DOUBLE_TYPE : 'double';
FLOAT_TYPE : 'float';
LONG_TYPE : 'long';

EQUALS : '==';
MORES : '>';
LESSS : '<';

STRUCT : 'struct';


REPEAT : 'repeat';

FUNTION_INT :'func_int';
FUNTION_DOUBLE :'func_double';

LOCAL : 'local';
IF : 'if';
END : 'end';
SCAN : 'scan';
SCAND : 'scand';
PRINT : 'print';
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
KROPKI : ':';
WS : [ \t\r\n]+ -> skip;