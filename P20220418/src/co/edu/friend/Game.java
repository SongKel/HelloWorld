package co.edu.friend;

import java.util.Random;

public class Game {
	public static void main(String[] args) {
		int point = 5;
		int number[] = new int[point];
		Random r = new Random();

		for (int i = 0; i < point; i++) {
			number[i] = r.nextInt(5) + 1;
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					i--;
				}
			}

		}
		for (int i = 0; i < point; i++) {
			System.out.print("" + (i + 1) + " => " + number[i]);
		}
		
	}
}
