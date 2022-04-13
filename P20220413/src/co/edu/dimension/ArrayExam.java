package co.edu.dimension;

public class ArrayExam {
	public static void main(String[] args) {
		int[][] intAry = new int[4][3];

		intAry[0][0] = 10;
		intAry[1][0] = 20;
		intAry[3][2] = 100;

		for (int j = 0; j < intAry.length; j++) {
			for (int i = 0; i < intAry[3].length; i++) {
				System.out.print("[" + j + "]" + "[" + i + "] => " + intAry[j][i] + " ");
			}
			System.out.println();
		}
		
		int[][] intAryj = new int[5][5];
		
		intAryj[0][0] = 1;
		intAryj[0][1] = 2;
		intAryj[0][2] = 3;
		intAryj[0][3] = 4;
		intAryj[0][4] = 5;
		
		intAryj[1][0] = 6;
		intAryj[1][1] = 7;
		intAryj[1][2] = 8;
		intAryj[1][3] = 9;
		intAryj[1][4] = 10;
		
		intAryj[2][0] = 11;
		intAryj[2][1] = 12;
		intAryj[2][2] = 13;
		intAryj[2][3] = 14;
		intAryj[2][4] = 15;
		
		intAryj[3][0] = 16;
		intAryj[3][1] = 17;
		intAryj[3][2] = 18;
		intAryj[3][3] = 19;
		intAryj[3][4] = 20;
		
		intAryj[4][0] = 21;
		intAryj[4][1] = 22;
		intAryj[4][2] = 23;
		intAryj[4][3] = 24;
		intAryj[4][4] = 25;
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3d", intAryj[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3d", intAryj[j][i]);
			}
			System.out.println();
		}
		for (int i = 4; i >=0; i--) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3d", intAryj[i][j]);
			}
			System.out.println();
		}
	}
}
