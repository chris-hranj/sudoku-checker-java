/**
 * CSC435 Programming Languages
 * Project1
 * Driver.java
 * @author  Christopher Hranj
 * @version 8/28/15
 */
package edu.tcnj.csc435.p1;

import java.util.Arrays;
/**
 * The Driver class contains the main method and will create a Sudoku object
 * from the .txt file that is passed in as a command line argument. 
 */
public class Driver {
    /**
     * The main method will take in a single command line argument:
     * a text file containing a single completed sudoku.
     * @param   args  any command line arguments being passed into the program
     */
    public static void main(String[] args){
        Sudoku checker = new Sudoku();
        /* Check invalid solution and print result.*/
        boolean result = checker.isValidSudoku(createInvalidSudoku());
        System.out.println("Valid Sudoku Board? " + result);
        /* Check valid solution and print result.*/
        result = checker.isValidSudoku(createValidSudoku());
        System.out.println("Valid Sudoku Board? " + result);

        /* Terminate program normally.*/
        System.exit(0);
    }
    /**
     * Create a valid sudoku solution to pass to our Sudoku class.
     * @return  a 2D array of characters that forms a valid sudoku solution
     */
    public static char[][] createValidSudoku(){
        char[][] validSudoku = new char[9][9];
        validSudoku[0][0] = '5'; validSudoku[1][0] = '3'; validSudoku[2][0] = '4';
        validSudoku[0][1] = '6'; validSudoku[1][1] = '7'; validSudoku[2][1] = '2';
        validSudoku[0][2] = '1'; validSudoku[1][2] = '9'; validSudoku[2][2] = '8';
        validSudoku[0][3] = '8'; validSudoku[1][3] = '5'; validSudoku[2][3] = '9';
        validSudoku[0][4] = '4'; validSudoku[1][4] = '2'; validSudoku[2][4] = '6';
        validSudoku[0][5] = '7'; validSudoku[1][5] = '1'; validSudoku[2][5] = '3';
        validSudoku[0][6] = '9'; validSudoku[1][6] = '6'; validSudoku[2][6] = '1';
        validSudoku[0][7] = '2'; validSudoku[1][7] = '8'; validSudoku[2][7] = '7';
        validSudoku[0][8] = '3'; validSudoku[1][8] = '4'; validSudoku[2][8] = '5';

        validSudoku[3][0] = '6'; validSudoku[4][0] = '7'; validSudoku[5][0] = '8';
        validSudoku[3][1] = '1'; validSudoku[4][1] = '9'; validSudoku[5][1] = '5';
        validSudoku[3][2] = '3'; validSudoku[4][2] = '4'; validSudoku[5][2] = '2';
        validSudoku[3][3] = '7'; validSudoku[4][3] = '6'; validSudoku[5][3] = '1';
        validSudoku[3][4] = '8'; validSudoku[4][4] = '5'; validSudoku[5][4] = '3';
        validSudoku[3][5] = '9'; validSudoku[4][5] = '2'; validSudoku[5][5] = '4';
        validSudoku[3][6] = '5'; validSudoku[4][6] = '3'; validSudoku[5][6] = '7';
        validSudoku[3][7] = '4'; validSudoku[4][7] = '1'; validSudoku[5][7] = '9';
        validSudoku[3][8] = '2'; validSudoku[4][8] = '8'; validSudoku[5][8] = '6';

        validSudoku[6][0] = '9'; validSudoku[7][0] = '1'; validSudoku[8][0] = '2';
        validSudoku[6][1] = '3'; validSudoku[7][1] = '4'; validSudoku[8][1] = '8';
        validSudoku[6][2] = '5'; validSudoku[7][2] = '6'; validSudoku[8][2] = '7';
        validSudoku[6][3] = '4'; validSudoku[7][3] = '2'; validSudoku[8][3] = '3';
        validSudoku[6][4] = '7'; validSudoku[7][4] = '9'; validSudoku[8][4] = '1';
        validSudoku[6][5] = '8'; validSudoku[7][5] = '5'; validSudoku[8][5] = '6';
        validSudoku[6][6] = '2'; validSudoku[7][6] = '8'; validSudoku[8][6] = '4';
        validSudoku[6][7] = '6'; validSudoku[7][7] = '3'; validSudoku[8][7] = '5';
        validSudoku[6][8] = '1'; validSudoku[7][8] = '7'; validSudoku[8][8] = '9';

        return validSudoku;
    }
    /**
     * Create an invalid sudoku solution to pass to our Sudoku class.
     * @return  a 2D array of characters that forms an invalid sudoku solution
     */
    public static char[][] createInvalidSudoku(){
        char[][] invalidSudoku = new char[9][9];
        /* Fill every element with the char '1'. */
        for (char[] row: invalidSudoku)
            Arrays.fill(row, '1');
        return invalidSudoku;
    }
}