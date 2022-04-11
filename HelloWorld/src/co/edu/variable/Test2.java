package co.edu.variable;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;
		num1 = 50;
		num2 = 60;
		num3 = 90;		
		int sum = (num1 + num2 + num3);
		double avg = (num1 + num2 + num3) / 3.0;
		int maxValue;
		maxValue = num1;
		if(maxValue < num2) {
		   maxValue = num2;	
		}
		if (maxValue < num3) {
			maxValue = num3;
		}
		
		System.out.printf("합은 %5d이고 평균은 %.2f이고, 최고점은 90점입니다.", sum, avg, maxValue);
    }
}

