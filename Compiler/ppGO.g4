grammar ppGO;

program : 
    PROGRAM LITERAL SEP_COLON varsDec* modulo* main;

main :
    FUNCTION 'main' LEFT_PAR RIGHT_PAR body;

modulo :
    tipo? FUNCTION LITERAL LEFT_PAR args RIGHT_PAR body;

tipo :
    ('int' | 'float' | 'string' | 'bool');

args : 
    ((tipo LITERAL) (',' tipo LITERAL)*)?;

body :
    LEFT_BRACKET varsDec* block return2? RIGHT_BRACKET;

block :
     ( funcCall |assigment | condition | loop | print2 | read )* return2?  ;

varsDec :
    tipo (LITERAL ((LEFT_SBRACKET (VAR_INT) RIGHT_SBRACKET) (LEFT_SBRACKET (VAR_INT) RIGHT_SBRACKET)?)? SEP_COMMA?)+;

assigment :
    LITERAL ((LEFT_SBRACKET (expression) RIGHT_SBRACKET) (LEFT_SBRACKET (expression) RIGHT_SBRACKET)?)? EQUAL expression SEP_SEMICOLON;

condition :
    IF LEFT_PAR expression  RIGHT_PAR LEFT_BRACKET block RIGHT_BRACKET ( elseif )* ( elsee )?;
elseif :
    ELSEIF LEFT_PAR expression RIGHT_PAR LEFT_BRACKET block RIGHT_BRACKET;
elsee : 
    ELSE LEFT_BRACKET block RIGHT_BRACKET;
expression : 
    expression1 ((AND | OR) expression1)?;

expression1 : 
    exp ((GREATER_THAN | LESS_THAN | GREATER_EQUAL | LESS_EQUAL | NOT_EQUAL | EQUAL_RELOP) exp)?;

exp : 
    term ((PLUS | MINUS) exp)?;

term : 
    factor ((TIMES | DIVISION) term)?;

factor: 
	LEFT_PAR expression RIGHT_PAR
	| var_cte (PLUS factor| MINUS factor)? ;

var_cte :
    LITERAL (((LEFT_SBRACKET (expression) RIGHT_SBRACKET) (LEFT_SBRACKET (expression) RIGHT_SBRACKET)?)? | (LEFT_PAR (expression (','  expression)*)? RIGHT_PAR)?)
    | VAR_INT
    | VAR_FLOAT | VAR_BOOL | VAR_STRING;

loop:
    LOOP LEFT_PAR expression RIGHT_PAR LEFT_BRACKET block RIGHT_BRACKET;

funcCall :
    LITERAL LEFT_PAR ((expression | funcCall) (',' (expression | funcCall))*)? RIGHT_PAR;

read : 
    INPUT LEFT_PAR (LITERAL ((LEFT_SBRACKET expression RIGHT_SBRACKET)  (LEFT_SBRACKET expression RIGHT_SBRACKET)?)? RIGHT_PAR);

print2 :
    PRINT LEFT_PAR expression RIGHT_PAR;

return2 :
    RETURN expression;


FUNCTION         : 'func';
LEFT_PAR         : '(';
RIGHT_PAR        : ')';
LEFT_BRACKET     : '{';
RIGHT_BRACKET    : '}';
LEFT_SBRACKET   : '[';
RIGHT_SBRACKET    : ']';

PLUS          : '+';
MINUS         : '-';
TIMES         : '*';
DIVISION      : '/';
LESS_THAN     : '<';
GREATER_THAN  : '>';
NOT_EQUAL     : '<>';
EQUAL_RELOP   : '==';
GREATER_EQUAL : '>=';
LESS_EQUAL    : '<=';


EQUAL         : '=';


SEP_COMMA        : ',';
SEP_COLON        : ':';
SEP_SEMICOLON    : ';';

AND              : 'AND';
OR               : 'OR';

IF               : 'if';
ELSE             : 'else';
ELSEIF           : 'else if';


PROGRAM          : 'program';

VAR_INT          : (DIGIT)+ ;
VAR_FLOAT        : [+-]?([0-9]*[.])?[0-9]+;
VAR_BOOL         : 'true' | 'false';
INPUT              : 'usr_input';
LOOP             : 'loop';

PRINT            : 'print';
RETURN           : 'return';
LITERAL          : [a-zA-Z]('_'?([a-zA-Z]|(DIGIT)))* ;
VAR_STRING       : '"' (ESC|.)*? '"' ;
fragment DIGIT   : '0'..'9' ;
WHITESPACE       : [ \t\r\n]+ -> skip ;
fragment
ESC : '\\"' | '\\\\' ;