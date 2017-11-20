// Define a grammar called Hello
grammar ACPC2017;


// COMMON TYPES
fragment DIGIT   : [0-9];
fragment RANK : [23456789TJQKA];
fragment SUIT : [shdc];
CARD : RANK SUIT ;
INT : DIGIT+;

//  ATOMS
FOLD : 'f';
CALL : 'c';
RAISE : 'r';
COLON : ':';
HLINE : '|';
SLASH : '/';
MATCHSTATE : 'MATCHSTATE' COLON;

position : INT;

hand_number : INT;

raise_value : INT;

round_x_betting : (FOLD | CALL | RAISE raise_value?)+;

betting : round_x_betting (SLASH round_x_betting?)*;

playerx_cards : (CARD)+;
roundx_board_cards : (CARD)*;

hole_cards : playerx_cards? HLINE playerx_cards? (HLINE playerx_cards)?;

board_cards : (SLASH roundx_board_cards)*;

cards : hole_cards board_cards;

// MATCH STATE
match_state : MATCHSTATE position COLON hand_number COLON betting? COLON cards;

// RESPONSES

server_response : match_state EOF;