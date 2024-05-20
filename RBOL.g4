grammar RBOL;


@header {
    package rbol;
}
prog: ( decl | expr )+ EOF;

decl: ID ':' INT_TYPE '=' NUM
    | ID ':' FLOAT_TYPE '=' FLOAT;

expr: expr '*' expr
    | expr '+' expr
    | ID
    | NUM;

ID: [a-zA-Z_-]+;
INT_TYPE: 'int';
NUM: '-'?[1-9][0-9]+ | '0';
FLOAT_TYPE: 'float';
FLOAT: '-'? '0'|[1-9]+ '.'[0-9]+;
