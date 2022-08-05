import java.util.Scanner;
import java.util.Arrays;
public class Interactive extends puzzle {
	public static void main(String[]args) {
		System.out.println("Interactive Mode. Select Difficulty:");
		Scanner scnr = new Scanner(System.in);
		int [][] puzzle;
		System.out.println("1 = Easy, 2 = Medium, 3 = Hard");
		int difficulty = scnr.nextInt();
		scnr.nextLine();
		if(difficulty==1) {
			difficulty = 4;
		}
		if(difficulty==2) {
			difficulty = 15;
		}
		if(difficulty==3) {
			difficulty = 50;
		}
		
//		Calls the random method here and performs it to the puzzle array according to the difficulty
		puzzle = random(difficulty);
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
        	
        
		int counter = 0;

		while (true) {
			output(puzzle);
			System.out.println("\n\nMake your move: ");
			String move = scnr.nextLine();
			puzzle=direction(puzzle, move);
			counter++;

			if(Arrays.deepEquals(puzzle, solved)) {
				output(puzzle);
                System.out.println("\n\nWOOOOO!!!! You solved the puzzle in " + counter + " moves.");
				break;
			}
			if(Arrays.deepEquals(puzzle, solved2)) {
				output(puzzle);
                System.out.println("\n\nWOOOOO!!!! You solved the puzzle in " + counter + " moves.");
				break;
			}

		}

	}
	



}
