package co.edu.array;

import java.util.Scanner;

public class ArrayExam5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] scores = new int[5];
		int maxVal = 0;
		int minVal = 100;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생점수를 입력>>>>> ");
			scores[i] = scn.nextInt();
			if (maxVal < scores[i]) {
				maxVal = scores[i];
			}
			if (minVal > scores[i]) {
				minVal = scores[i];
			}
		}

		// 학생중에서 최고점, 최저점.
		System.out.println("최고점은 " + maxVal + "점 " + "최저점은 " + minVal + "점");
		
		// 학생이름, 점수
		// 배열, 배열 0=> 학생, 90
	}
}