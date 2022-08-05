import java.util.Scanner;
import java.util.Arrays;

public class Validate extends puzzle {
	
	public static void main(String[]args) {
		System.out.println("Validation Mode. Please input Puzzle: ");
		Scanner scnr = new Scanner(System.in);
		int [][] puzzle = input();
		output(puzzle);
//		The purpose of initializing this here is to check first if what the player input is a solution
		int[][] solved = new int[4][4];
        solved[0][0] = 0;
        solved[0][1] = 1;
        solved[0][2] = 2;
        solved[0][3] = 3;
        solved[1][0] = 4;
        solved[1][1] = 5;
        solved[1][2] = 6;
        solved[1][3] = 7;
        solved[2][0] = 8;
        solved[2][1] = 9;
        solved[2][2] = 10;
        solved[2][3] = 11;
        solved[3][0] = 12;
        solved[3][1] = 13;
        solved[3][2] = 14;
        solved[3][3] = 15;

		System.out.println("\nPlease enter your moves: ");
		String moves = scnr.nextLine();
//		Calling direction here will perform moves User inputs onto the puzzle
		puzzle = direction (puzzle, moves);
		System.out.println("");
//		Prints new puzzle
		output(puzzle);
//		Calling this will check the valid of the moves (if the puzzle is solved)
		result (validate (puzzle));
		
		}
	
//		Captures the order of elements the user inputs for the puzzle and creates it
	public static int[][] input(){
		Scanner scnr = new Scanner(System.in);
		int[][] newArray = new int[4][4];
		int row;
		int col;
		
		for (row=0; row < 4; ++row) {
			for(col=0; col < 4; ++col) {
				newArray[row][col]=scnr.nextInt();
				
			}
		}
		System.out.println("");
	
		return newArray;
	}
//		Compared the result of the users moves onto the input puzzle to the solution array and alt solution
	private static boolean validate(int[][] puzzle) {
		int[][] solved = new int[4][4];
        solved[0][0] = 0;
        solved[0][1] = 1;
        solved[0][2] = 2;
        solved[0][3] = 3;
        solved[1][0] = 4;
        solved[1][1] = 5;
        solved[1][2] = 6;
        solved[1][3] = 7;
        solved[2][0] = 8;
        solved[2][1] = 9;
        solved[2][2] = 10;
        solved[2][3] = 11;
        solved[3][0] = 12;
        solved[3][1] = 13;
        solved[3][2] = 14;
        solved[3][3] = 15;
        		
		int[][] solved2 = new int[4][4];
        solved2[0][0] = 1;
        solved2[0][1] = 2;
        solved2[0][2] = 3;
        solved2[0][3] = 4;
        solved2[1][0] = 5;
        solved2[1][1] = 6;
        solved2[1][2] = 7;
        solved2[1][3] = 8;
        solved2[2][0] = 9;
        solved2[2][1] = 10;
        solved2[2][2] = 11;
        solved2[2][3] = 12;
        solved2[3][0] = 13;
        solved2[3][1] = 14;
        solved2[3][2] = 15;
        solved2[3][3] = 0;
        	
		if(Arrays.deepEquals(puzzle, solved)) {
    		return true;

		}
		if(Arrays.deepEquals(puzzle, solved2)) {
    		return true;

		}
		else {
			return false;
		}
        		
        		
	}
	
//		Prints the result of validate method
	public static void result(boolean valid) {
		if (valid == true) {
			System.out.println("\n\nValid! :)");
		}
		else {
			valid = false;
			System.out.println("\n\nFailed :(");

		}
	
	}

		
//		Calls the swap Methods and will check Char by Char of the input moves

	


}