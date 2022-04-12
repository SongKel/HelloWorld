package co.edu.loop;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		// 임의의 값 범위 (1 ~ 6 : 주사위의 면의 갯수.)

		int randomVal = (int) (Math.random() * 6) + 1;
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		while (true) {
			System.out.println("수를 입력하시오.");
			int userVal = scn.nextInt();
			if (userVal == randomVal) {
				System.out.println("정답.");
				break;
			} else {
				if (userVal > randomVal) {
					System.out.println("입력값보다 작습니다.");
				}
			}
			if (userVal < randomVal) {
				System.out.println("입력값보다 큽니다.");
			}
		}
	}
}
