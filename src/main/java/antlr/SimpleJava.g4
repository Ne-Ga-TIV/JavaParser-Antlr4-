grammar SimpleJava;

program : classDeclaration;

classDeclaration : accessModifiers? 'class' ID '{' mainMethod medhotDecalration* '}';

mainMethod : 'public' 'static' 'void' 'main' '(' 'String' '[]' ID ')' '{' statement+ '}';

ifStatement : 'if' '(' ifExpression ')' (statement | block) ('else' (statement | block))?;

ifExpression : ID | (expression '==' expression) | function;

accessModifiers : 'public' | 'private' | 'protecrted' | 'default';

function: ID '(' ((expression ','?)*) ')';



block : '{' (statement*) '}';

statement : variableDeclaration
          | assignment
          | printStatement
          | ifStatement
          | forStatement
          | whileStatement
          | doWhileStatement
          | returt
          | ((increments ID) | (ID increments)) ';'
          | keyCicleWords;

increments : '++' | '--';

returt : 'return' ID? ';';

medtotArgsVariable : type ID ','?;

medhotDecalration : accessModifiers? 'static'? (type | 'void') ID '(' medtotArgsVariable* ')' block;

expression : INT
           | ID
           | expression ('+'|'-'|'*'|'/'| '%' | '<' | '&&' | '=>' | '<=' | '>' | '||' | '==') expression
           | '(' expression ')'
           | function
           | (increments ID) | (ID increments)
           | STRING
           | 'true'
           | 'false' ;

type : ('int' | 'String' | 'boolean' | 'double' | 'char' | 'float')  array?;


array: '[]';
variableDeclaration :  accessModifiers? 'static'? type ID '='  expression (';' | ',') assignment?;

keyCicleWords: 'continue' | 'break' ';';

assignment : ID '=' expression ';';

forStatement : 'for' '(' forControl ')' (block | statement);

forControl : (variableDeclaration? | ';'?) (expression | function) ';' expression?;

whileStatement : 'while' '(' (expression | function) ')' (block | statement);

doWhileStatement : 'do' block 'while' '(' expression  | function')' ';';


printStatement : 'System.out.' ('println' | 'print') '(' expression ')' ';';

ID : [a-zA-Z_] [a-zA-Z_0-9]*;
INT : [0-9]+;
STRING : '"' ~["]* '"';
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
WS : [ \t\r\n]+ -> skip;
