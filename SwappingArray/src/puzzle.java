import java.util.concurrent.ThreadLocalRandom;

public class puzzle {
	static int [][] gamefield;
	int x,y;
	static int row = locate(gamefield)[0];
    static int column = locate(gamefield)[1];
	static int hold;

	
//	Main Class will create the gamefield for the puzzle
	public static void main(String[] args) {
		int[][] puzzle;
		puzzle = makeGame() ;
		output(puzzle);
	}
//	This is inputs the value for gamefield into the array
	public static int[][]makeGame(){
        int[][] gamefield = new int[4][4];
        gamefield[0][0] = 0;
        gamefield[0][1] = 1;
        gamefield[0][2] = 2;
        gamefield[0][3] = 3;
        gamefield[1][0] = 4;
        gamefield[1][1] = 5;
        gamefield[1][2] = 6;
        gamefield[1][3] = 7;
        gamefield[2][0] = 8;
        gamefield[2][1] = 9;
        gamefield[2][2] = 10;
        gamefield[2][3] = 11;
        gamefield[3][0] = 12;
        gamefield[3][1] = 13;
        gamefield[3][2] = 14;
        gamefield[3][3] = 15;
     
        return gamefield;
	}
//		This will locate 
		public static int[] locate(int[][] gamefield){
			int [] locate = new int[2];
			for (column=0; column<4; ++column) {
				for(row=0; row<4; ++row) {
					if(gamefield[row][column]==0) {
						locate[0]=row;
						locate[1]=column;		
					}
				}
				
			}
			return locate;
		}
		
//		Will swap the values of the element above the 0, only if the row above is greater than 0
		public static int[][] swapU(int[][] gamefield){
			int row = locate(gamefield)[0];
			int column = locate(gamefield)[1];
			int hold;

			if (row>0) {
				hold = gamefield[row-1][column];
				gamefield[row-1][column]=gamefield[row][column];
				gamefield[row][column]=hold;
						
						
			}

			return gamefield;
		}
		
//		Will swap the values of the element below the 0, only if the row above is less than 3
		public static int[][] swapD(int[][] gamefield){
			if (row < 3) {
				hold = gamefield[row+1][column];
				gamefield[row+1][column]=gamefield[row][column];
				gamefield[row][column]=hold;
						
						
			}
			return gamefield;


		}
		
//		Will swap the values of the element to the left of 0, only if the column is greater than 0
		public static int[][] swapL(int[][] gamefield){
			if (column>0) {
				hold = gamefield[row][column-1];
				gamefield[row][column-1]=gamefield[row][column];
				gamefield[row][column]=hold;			
			}

			return gamefield;
		}
		
//		Will swap the values of the element to the right of 0, only if the column is less than 3
		public static int[][] swapR(int[][] gamefield){

			if (column<3) {
				hold = gamefield[row][column+1];
				gamefield[row][column+1]=gamefield[row][column];
				gamefield[row][column]=hold;
						
			}
			
			
			return gamefield;
		}
		
		
//		Calls the swap methods into an if statement which perform accoring to the Char input by the user	

		public static int[][] direction(int[][] newArray, String moves){
			int length = moves.length();
			int i; 
			
			for (i = 0; i< length; ++i) {
				if (moves.charAt(i) == 'L') {
					swapL(newArray);
				}
				if (moves.charAt(i) == 'R') {
					swapR(newArray);
				}
				if (moves.charAt(i) == 'U') {
					swapU(newArray);
				}
				if (moves.charAt(i) == 'D') {
					swapD(newArray);
				}

			}
			return newArray;

		}

//		ThreadLocalRandom initializes a local random number that wouldn't be modified
		public static int[][] random(int steps) {
			int [][] scramble = makeGame();
			while (steps>0) {
				int direction = ThreadLocalRandom.current().nextInt(0,4);
				switch(direction) {
				case 0: 
					swapL(scramble);
					steps--;
					break;
				case 1: 
					swapR(scramble);
					steps--;
					break;
				case 2: 
					swapD(scramble);
					steps--;
					break;
				case 3: 
					swapU(scramble);
					steps--;
					break;
				}
				
			}
			return scramble;
			
		}

//		Will create a format for the array 
		public static void output(int[][] gamefield) {
			
	        for (int i = 0; i < 4; i++) {
	            System.out.println("|");
	            System.out.println("+-------+-------+-------+-------+");
	            for (int l = 0; l < 4; l++) {
	                System.out.print("|   " + gamefield[i][l] + "\t");
	            }
	        }
		}



}
