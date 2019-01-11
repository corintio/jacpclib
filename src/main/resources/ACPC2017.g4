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

action_fold : FOLD;
action_call : CALL;

action_raise_value : RAISE raise_value;
action_raise : RAISE;

round_x_betting : (action_fold | action_call | action_raise_value | action_raise)+;

bet : round_x_betting (SLASH round_x_betting?)*;

player_card : CARD;
playerx_cards : player_card+;

round_card : CARD;
roundx_board_cards : round_card*;

board_cards : roundx_board_cards (SLASH roundx_board_cards)*;

hole_cards : (playerx_cards HLINE+) | (HLINE+ playerx_cards HLINE+) | (HLINE+ playerx_cards);

cards : hole_cards board_cards;

// MATCH STATE
match_state : MATCHSTATE position COLON hand_number COLON bet? COLON cards;

// RESPONSES

server_response : match_state EOF;