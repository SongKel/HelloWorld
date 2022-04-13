package co.edu.array;

import java.util.Scanner;

public class ArrayExam6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String[] names = new String[3]; // 학생이름
		int[] scores = new int[3]; // 학생점수

		for (int i = 0; i < names.length; i++) {
			System.out.println("학생이름을 입력하세요>>>");
			names[i] = scn.nextLine();

			System.out.println("학생점수를 입력하세요>>>");
			scores[i] = scn.nextInt();
			scn.nextLine();

			// 홍길동, 김길동, 박길동
			// 40, 50, 60
		}

		System.out.println("조회할 학생이름을 입력하세요>>>");
		String serchName = scn.nextLine();
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(serchName)) {
				System.out.println(serchName + "의 점수는 " + scores[i] + "점입니다.");
			}
		}

		System.out.println("end of prog.");

	}
}
