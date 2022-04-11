package co.edu.variable;

import java.util.Scanner;

public class OpreatorExample2 {
    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	// 127 / 10 => 몫: 12, 나머지: 7
	int result = 127 / 10;
	int result2 = 127 % 10;
	int value = 115; 
	if(115 % 3 == 0) {
	System.out.println("10개를 담을 수 있는 박스: ");
	result = scn.nextInt();
	
	} else {
		System.out.println("5개를 담을 수 있는 박스: ");		
		result2 = scn.nextInt();
	}
  }
}