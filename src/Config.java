///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           A text based adventure program.
// Course:          CS200 Fall 2020
//
// Author:          Skylar Zhao
// Email:           xzhao379 @wisc.edu email address
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples:
// TA，help with the enter method and parseCoordinate method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

/**
 * This file contains constants for the text Adventure project. Also at the bottom of this file
 * are READ ME Notes for the Grader.
 *
 * @author Jim Williams
 * @author Skylar Zhao
 * @email xzhao379@wisc.edu
 */
public class Config {

    /**
     * Indexes into coordinate arrays specifying a location in the map.
     */
    public static final int ROW = 0;
    public static final int COLUMN = 1;

    /**
     * Indexes into the fields/attributes array for each map location (3rd dimension of
     * the map array)
     */
    public static final int NAME = 0;
    public static final int ENTER_TEXT = 1;
    public static final int ENTER_RESULT = 2;
    public static final int NEARBY_TEXT = 3;
    //add additional indexes here for additional field information added to each configuration
    //line.

    /**
     * Values within the location fields/attributes that are used for game logic other than
     * simply printing out.
     */
    //In name field, designates the starting location of the player
    public static final String NAME_START = "start";

    //The result of the player entering the field.
    public static final String RESULT_RANDOM_MOVE = "randomMove";
    public static final String RESULT_WIN = "win";
    public static final String RESULT_LOSE = "die";
    //add additional game logic fields here (not text fields that are simply printed).

    /**
     * Values used by the player to navigate through the map.
     */
    public static final String MOVE_UP = "w";
    public static final String MOVE_DOWN = "s";
    public static final String MOVE_LEFT = "a";
    public static final String MOVE_RIGHT = "d";
    public static final String NEARBY = "n";
    public static final String QUIT = "q";
    //add additional game control characters here, throwing, shooting, etc.

}

/*
Your READ ME notes to the Grader
Describe your enhancements to the program, map, etc. here.  You may include a link to a
YouTube video of a maximum of 2 minutes demonstrating your program.

0) Overview of your changes or a YouTube video link (max 2 minutes)
I have changed the elements in the new Configuration file, and add tests for the four methods.


1) Configuration Example: Contents of your own configuration (.advcfg) file
The game is about escaping the maze. The player will encounter the cavity, map, key, vampire in the maze adventure.
For example, if the player encounters the cavity, the player will lose, and the game is over.
             if the player encounters the vampire, he/she is eaten by the vampire, the game is over.
             if the player finds the key, the player will win, because he/she finds the key to unlock the door,
             the game is over and player wins.
             if the player finds the map, there is route appears on the map, which means map will guide the player
             somewhere, and random move.


2) Configuration Description: Describe unique elements in your configuration file
The game is about escaping the maze. The player will encounter the cavity, map, key, vampire in the maze adventure.
For example, if the player encounters the cavity, the player will lose, and the game is over.
             if the player encounters the vampire, he/she is eaten by the vampire, the game is over.
             if the player finds the key, the player will win, because he/she finds the key to unlock the door,
             the game is over and player wins.
             if the player finds the map, there is route appears on the map, which means map will guide the player
             somewhere, and random move.



3) writeMap Output: Example output of the writeMap method for your configuration file.
   1     2     3     4     5     6
0[    ][    ][    ][    ][start][    ]
1[    ][    ][    ][    ][    ][    ]
2[    ][    ][key][    ][    ][    ]
3[    ][    ][    ][    ][map][    ]
4[    ][    ][    ][cavity][cavity][    ]
5[    ][    ][Vampire][    ][    ][    ]
6[Vampire][map][map][map][map][    ]
7[    ][    ][    ][    ][    ][    ]


4) Choose at least 1 of the following ways you extended the game and describe them:
  a) Tools: added your own tools/weapons and use of them in the game
  b) Audio: playing of audio files when sensing the neighbors, rather than simply text
  c) Test Cases: adding test cases to TestAdventure that thoroughly test the methods you wrote.
  I add test cases for 4 methods
  d) Your Own: describe any other changes or additions we should consider for credit.










 */
