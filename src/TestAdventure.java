///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           A text based adventure program.
// Course:         cs200,fall,2020
//
// Author:          Skylar Zhao
// Email:           xzhao379 @wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples:
// TA，help with the enter method and parseCoordinate method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

/**
 * This contains testing methods for the Adventure program.
 */
public class TestAdventure {

    /**
     * Uncomment testing methods to have them run.
     * @param args unused
     */
    public static void main(String[] args) throws FileNotFoundException {
        testParseCoordinates();
        testParseFields();
        testDetermineLocation();
        testEnter();


    }

    /**
     * Tests for the parseCoordinates method.
     */
    private static void testParseCoordinates() {
        boolean error = false;

        {
            String coordinateString = "8,6";
            int [] expected = new int[]{8,6};
            int [] actual = Adventure.parseCoordinates(coordinateString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseCoordinates 1) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }

        {
            String coordinateString = "5";
            int [] expected = null;
            int [] actual = Adventure.parseCoordinates(coordinateString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseCoordinates 2) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }


        {
            String coordinateString = "this is test";
            int [] expected = null;
            int [] actual = Adventure.parseCoordinates(coordinateString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseCoordinates 3) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }



        {
            String coordinateString = "pi,10/";
            int [] expected = null;
            int [] actual = Adventure.parseCoordinates(coordinateString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseCoordinates 4) Expected: " + Arrays.toString(expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }


        if ( error) {
            System.out.println("Error in testParseCoordinates.");
        } else {
            System.out.println("All tests in testParseCoordinates passed.");
        }
    }

    /**
     * Tests for the parseField method.
     */

    private static void testParseFields() {
        boolean error =  false;
        {
            String fieldInformation = " //  /";
            String [] expected = new String []{"","","",""};
            String [] actual = Adventure.parseFields (fieldInformation);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseFields 1) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }



        {
            String fieldInformation = "*";
            String [] expected = new String []{"*"};
            String [] actual = Adventure.parseFields (fieldInformation);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseFields 2) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }




        {
            String fieldInformation = "size/This is the size of the maze//";
            String [] expected = new String []{"size","This is the size of the maze","",""};
            String [] actual = Adventure.parseFields (fieldInformation);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseFields 3) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }





        if ( error) {
            System.out.println("Error in testField.");
        } else {
            System.out.println("All tests in testField passed.");
        }

    }

    /**
     *  Tests for the determineLocation method
     */
    private static void testDetermineLocation() {
        boolean error =  false;
        String[][][] map = new String[8][6][];


        {
            String direction = Config.MOVE_UP;
           int[] currentLocation = {0,0};
            int [] expected = new int[]{7,0};
            int [] actual = Adventure.determineLocation(map, currentLocation, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 1) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }


        {
            String direction = Config.MOVE_UP;
            int[] currentLocation = {4,3};
            int [] expected = new int[]{3,3};
            int [] actual = Adventure.determineLocation(map, currentLocation, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 2) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }


        {
            String direction = Config.MOVE_LEFT;
            int[] currentLocation = {2,3};
            int [] expected = new int[]{2,2};
            int [] actual = Adventure.determineLocation(map, currentLocation, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 3) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }

        {
            String direction = Config.MOVE_LEFT;
            int[] currentLocation = {2,0};
            int [] expected = new int[]{2,5};
            int [] actual = Adventure.determineLocation(map, currentLocation, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 4) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }

        {
            String direction = Config.MOVE_RIGHT;
            int[] currentLocation = {4,5};
            int [] expected = new int[]{4,0};
            int [] actual = Adventure.determineLocation(map, currentLocation, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 5) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        {
            String direction = Config.MOVE_RIGHT;
            int[] currentLocation = {2,2};
            int [] expected = new int[]{2,3};
            int [] actual = Adventure.determineLocation(map, currentLocation, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 6) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }

        {
            String direction = Config.MOVE_DOWN;
            int[] currentLocation = {7,3};
            int [] expected = new int[]{0,3};
            int [] actual = Adventure.determineLocation(map, currentLocation, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 7) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }

        {
            String direction = Config.MOVE_DOWN;
            int[] currentLocation = {3,3};
            int [] expected = new int[]{4,3};
            int [] actual = Adventure.determineLocation(map, currentLocation, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 8) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }







        if ( error) {
            System.out.println("Error in testDetermineLocation.");
        } else {
            System.out.println("All tests in testDetermineLocation passed.");
        }
    }

    /**
     * Tests for the testEnter method
     * @throws FileNotFoundException
     */

    private static void testEnter () throws FileNotFoundException {
        boolean error =  false;
        Random rand = new Random();

        {
            String configurationFile = "wumpus.advcfg";
            int[] location = new int[]{0,0};
            String [][][] map = Adventure.loadAdventure(configurationFile,location);
             location = new int[]{2,2};
             boolean expected = true;
             boolean actual = Adventure.enter (map,location,rand);
             if( expected != actual ){
                System.out.println ("testEnter 1) Expected:"+ expected + " Actual "+ actual);
                error=true;

            }

        }

        {
            String configurationFile = "wumpus.advcfg";
            int[] location = new int[]{0,0};
            String [][][] map = Adventure.loadAdventure(configurationFile,location);
            location = new int[]{7,5};
            boolean expected = false;
            boolean actual = Adventure.enter(map,location,rand);
            if( expected != actual ){
                System.out.println ("testEnter 2) Expected:"+ expected + " Actual "+ actual);
                error = true;

            }

        }

        {
            String configurationFile = "wumpus.advcfg";
            int[] location = new int[]{0,0};
            String [][][] map = Adventure.loadAdventure(configurationFile,location);
            location = new int[]{4,3};
            boolean expected = false;
            boolean actual = Adventure.enter(map,location,rand);
            if( expected != actual ){
                System.out.println ("testEnter 3) Expected:"+ expected + " Actual "+ actual);
                error = true;

            }

        }

        {
            String configurationFile = "wumpus.advcfg";
            int[] location = new int[]{0,0};
            String [][][] map = Adventure.loadAdventure(configurationFile,location);
            location = new int[]{6,0};
            boolean expected = false;
            boolean actual = Adventure.enter(map,location,rand);
            if( expected != actual ){
                System.out.println ("testEnter 4) Expected:"+ expected + " Actual "+ actual);
                error = true;

            }

        }
        {
            String configurationFile = "wumpus.advcfg";
            int[] location = new int[]{0,0};
            String [][][] map = Adventure.loadAdventure(configurationFile,location);
            location = new int[]{0,4};
            boolean expected = false;
            boolean actual = Adventure.enter(map,location,rand);
            if( expected != actual ){
                System.out.println ("testEnter 5) Expected:"+ expected + " Actual "+ actual);
                error = true;

            }

        }


        if ( error) {
            System.out.println("Error in testEnter.");
        } else {
            System.out.println("All tests in testEnter passed.");
        }

    }






}
