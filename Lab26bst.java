package arrays;// Lab26bst.java
// This is the student version of the knight's tour lab assignment.


import java.text.DecimalFormat;
import java.util.Scanner;


public class Lab26bst {
    public static void main(String args[]) {
        System.out.println("\nLab26b 90/100 Point Version\n");
        Knight knight = new Knight();
        knight.getStart();
        knight.solveTour();
        knight.displayBoard();
    }
}


class Knight {
    private int board[][];            // stores the sequence of knight moves
    private int startRow;            // row location where the knight starts
    private int startCol;            // col location where the knight starts
    private int rowPos;                // current row position of the knight
    private int colPos;                // current col position of the knight
    private int moves;                // number of location visited by the knight
	
	/*								USED WITH THE 100 POINT VERSION
	final private int ACCESS[][] = {{0,0,0,0,0,0,0,0,0,0,0,0},
 						 			{0,0,0,0,0,0,0,0,0,0,0,0},
     					 			{0,0,2,3,4,4,4,4,3,2,0,0},
     					 			{0,0,3,4,6,6,6,6,4,3,0,0},
     					 			{0,0,4,6,8,8,8,8,6,4,0,0},
     					 			{0,0,4,6,8,8,8,8,6,4,0,0},
     					 			{0,0,4,6,8,8,8,8,6,4,0,0},
     					 			{0,0,4,6,8,8,8,8,6,4,0,0},
     					 			{0,0,3,4,6,6,6,6,4,3,0,0},
     					 			{0,0,2,3,4,4,4,4,3,2,0,0},
     					 			{0,0,0,0,0,0,0,0,0,0,0,0},
     					 			{0,0,0,0,0,0,0,0,0,0,0,0}}; 	
	*/


    public Knight()
    // constructor used to initializes the data attributes
    {

        board = new int[12][12];
        startRow = 0;
        startCol = 0;
        rowPos = 0;
        colPos = 0;
        moves = 1;


        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
                board[row][col] = -1;
            }
        }

        for (int row2 = 2; row2 < 10; row2++) {
            for (int col2 = 2; col2 < 10; col2++) {
                board[row2][col2] = 0;
            }
        }


    }


    public void getStart()
    // input method to get starting row and col from keyboard entry
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter row start: ");
        startRow = scan.nextInt() - 1;
        System.out.println();
        System.out.print("Enter column start:  ");
        startCol = scan.nextInt() -	 1;
        System.out.println();

    }


    public void displayBoard()
    // displays the chessboard after the tour is concluded
    {

    	DecimalFormat dF = new DecimalFormat();

        for (int row = 2; row < 10; row++) {
            for (int col = 2; col < 10; col++) {
                System.out.print(dF.format((board[row][col] + "\t")));
            }
            System.out.println();
        }

    }


    private boolean getMove() //its not moving through positions
    // computes the next available knight's move.  Alters RowPos and ColPos and
    // returns true if move is possible, otherwise returns false
    {

	boolean position = false;

	if(board[rowPos + 1][colPos + 2] == 0){
		position = true;
		board[rowPos][colPos] = board[rowPos + 1][colPos + 2];

	}

	if(board[rowPos + 1][colPos - 2] == 0){
		position = true;
		board[rowPos][colPos] = board[rowPos + 1][colPos - 2];
	}

	if(board[rowPos - 1][colPos + 2] == 0){
		position = true;
		board[rowPos][colPos] = board[rowPos - 1][colPos + 2];
	}

	if(board[rowPos - 1][colPos - 2] == 0){
		position = true;
		board[rowPos][colPos] = board[rowPos - 1][colPos - 2];
	}

	if(board[rowPos + 2][colPos + 1] == 0){
		position = true;
		board[rowPos][colPos] = board[rowPos + 2][colPos + 1];
	}

	if(board[rowPos - 2][colPos + 1] == 0){
		position = true;
		board[rowPos][colPos] = board[rowPos - 2][colPos + 1];
	}

	if(board[rowPos + 2][colPos - 1] == 0){
		position = true;
		board[rowPos][colPos] = board[rowPos + 2][colPos - 1];

		}

	if(board[rowPos - 2][colPos - 1] == 0){
		position = true;
		board[rowPos][colPos] = board[rowPos - 2][colPos - 1];

		}


		return position;


    }


    public void solveTour()
    // primary method that drives the knight's tour solution
    {
		board[startRow][startCol] = moves;

		boolean complete = true;

		while(!complete){

			if(getMove()){
				moves++;
				board[rowPos][colPos] = moves;
			}
			else{
				complete = true;
			}

		}
    }


}
