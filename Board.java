package game1;
//import java.util.Scanner;

public class Board {

	public String boardMat [][]  = new String [15][15];
	
	public Board() {
		initialiseBoardMat();
	}
	
 	private void initializeSafeHouse() {
		boardMat[2][6] = " X ";
		boardMat[1][8] = " X ";
		boardMat[6][1] = " X ";
		boardMat[6][12] = " X ";
		boardMat[8][2] = " X ";
		boardMat[8][13] = " X ";
		boardMat[13][6] = " X ";
		boardMat[12][8] = " X ";
		
	}
	
	private void initialiseBoardMat() {
		for(int i = 0; i<6; i++) {
			for(int j = 0; j<15; j++ ) {
				if(((i==1)&& (j==1||j==4)) || (i==4)&& (j==1||j==4) ) {
					boardMat[i][j] = " R ";
				}
				else if(j>=6 && j<=8) {
					boardMat[i][j] = " - ";
				}
				else if(((i==1)&& (j==10||j==13)) || (i==4)&& (j==10||j==13) ) {
					boardMat[i][j] = " B ";
				}
				else {
					boardMat[i][j] = " ~ "; 
				}
			}
		}
		for(int i = 6; i< 9; i++) {
			for(int j = 0;j<15; j++) {
				if(j>=6 && j<=8) {
					boardMat[i][j] = " X ";
				}
				else {
					boardMat[i][j] = " - ";
				}
			}
		}
		for(int i = 9; i<15; i++) {
			for(int j = 0; j<15; j++ ) {
				if(((i==10)&& (j==1||j==4)) || (i==13)&& (j==1||j==4) ) {
					boardMat[i][j] = " G ";
				}
				else if(j>=6 && j<=8) {
					boardMat[i][j] = " - ";
				}
				else if(((i==10)&& (j==10||j==13)) || (i==13)&& (j==10||j==13) ) {
					boardMat[i][j] = " Y ";
				}
				else {
					boardMat[i][j] = " ~ "; 
				}
			}
		}
		initializeSafeHouse();
	}
	
	private String NumToHex(int n) {
		String ret = "";
		if(n<10)
			ret = n+"";
		else {
			switch(n) {
			case 10: ret = "A";break;
			case 11: ret = "B";break;
			case 12: ret = "C";break;
			case 13: ret = "D";break;
			case 14: ret = "E";break;
			case 15: ret = "F";break;
			default: ret = "X";
			}
		}
		return ret;
	}
	
	public void printBoard() {
		for(int i = 0; i < 15; i++) {
			if(i==0) {
				for(int j = 0; j < 16; j++) {
					if(j==0)
						System.out.print("   ");
					else
						System.out.print(" "+NumToHex(j-1)+" ");
				}
				System.out.println();
				
			}
			for(int j = 0; j < 15; j++) {
				if(j==0)
					System.out.print(" "+NumToHex(i)+" ");
				System.out.print(boardMat[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Board b1 = new Board();
		b1.initialiseBoardMat();
		b1.printBoard();

	}

}
