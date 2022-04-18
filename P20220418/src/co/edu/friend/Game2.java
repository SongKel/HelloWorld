package co.edu.friend;

import java.util.Random;
import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
//		System.out.println("[*] [*] [*] [*] [*]");
		int count = 5;
		int problem[] = new int[count];
		Scanner scn = new Scanner(System.in);

		Random r = new Random();
		for (int i = 0; i < count; i++) {
			problem[i] = r.nextInt(5) + 1;
			for (int j = 0; j < i; j++) {
				if (problem[i] == problem[j]) {
					i--;

				}
			}
		}
		for (int i = 0; i < count; i++) {
		}
		for (int i = 0; i <= count; i++) {
			if (i == 1) {
				System.out.println("[*] [*] [*] [*] [*]");
				scn.next();
				System.out.print("[" + problem[i] + "]" + "[*]" + "[*]" + "[*]" + "[*]");
			} else if(i == 2) {
				
			}
				
		}
	}
}
