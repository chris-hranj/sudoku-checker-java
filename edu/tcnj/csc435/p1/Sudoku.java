/**
 * CSC435 Programming Languages
 * Project1
 * Sudoku.java
 * @author  Christopher Hranj
 * @version 8/28/15
 */
package edu.tcnj.csc435.p1;

import java.util.HashSet;

/**
 * The Sudoku class will contain a single method that checks if a sudoku board
 * is valid. A sudoku board is a 9x9 character array.
 */
public class Sudoku {
    /**
     * The isValidSudoku method will accept a two-dimensional char array as 
     * input and check the chars to see if they make up a valid sudoku board.
     * @param   board  the 9x9 char array that makes up the sudoku board. an
     *                 assumption is made that the board is not null and has
     *                 9x9 dimensions
     * @return         true if board is a valid sudoku board solution,
     *                 false otherwise
     */
    public boolean isValidSudoku(char[][] board) {
        /* HashSets are being used for their ability to create unique 
           collections of characters. Each element of a row or column will be
           added, and if the operation returns false then there is a duplicate
           number in a row/column, resulting in an invalid sudoku solution.
        */
        HashSet<Character> column;
        HashSet<Character> row;
        HashSet<Character> box;

        for (int i = 0; i < 9; i++) {
            column = new HashSet<Character>();
            row = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                /* Check that char is not a '.' and that adding
                   the char to either hashsets returns true, meaning
                   the char was unique.
                */
                if(board[i][j] != '.' && !column.add(board[i][j])) {
                    return false;
                }
                if(board[j][i] != '.' && !row.add(board[j][i])) {
                    return false;
                }
            }
        }
        /* Increment boxColumn by 3 and boxRow by 3 three times to move to a different 
           3x3 box after each iteration of the loop. 
        */
        for (int boxColumn = 0; boxColumn < 9; boxColumn += 3) {
            for (int boxRow = 0; boxRow < 9; boxRow += 3) {
                box = new HashSet<Character>();
                /* Increment i by 1 and j by 1 three times to stay within the 
                   bounds of a 3x3 box. 
                */
                for (int i = boxColumn; i < boxColumn + 3; i++) {
                    for (int j = boxRow; j < boxRow + 3; j++) {
                        /* Check that char is not a '.' and that adding
                           the char to the hashset returns true.
                        */
                        if(board[i][j] != '.' && !box.add(board[i][j])) {
                            return false;
                        }
                    }
                }
            }
        }
        /* If none of the add operations returned false, the sudoku board is 
           valid and we return true.
        */
        return true;
    }
}