package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// Math.random()의 생성범위 1 ~ 10 까지가 되도록.=> randomVal
		// 사용자의 입력값을 담는 변수 userVal.

		// while구문을 사용해서 임의의 값이랑 입력값이 같으면 종료.
		// 사용자 값 비교 랜덤값이랑 비교...입력한 랜덤 크다. 작다.
		int randomVal = (int) (Math.random() * 10) + 1;
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		while (true) {
			System.out.println("값을 입력하시오.");
			int userVal = scn.nextInt();
			if (userVal == randomVal) {
				System.out.println("정답.");
                  break;
			} else {
				if (userVal > randomVal) {
					System.out.println("입력값보다 작습니다.");
				}
			} if (userVal < randomVal) {
				System.out.println("입력값보다 큽니다.");
			}
		}
	}
}
