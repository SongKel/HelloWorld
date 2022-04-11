package co.edu.variable;

import java.util.Scanner;

public class OperatorExample {
    public static void main(String[] args) {
		// 나머지: %
    	// 6/4 => 몫: 1, 나머지: 2
    	//int result = 6 / 4;
    	//int result2 = 6 % 4;
    	//int valrue = 5;
    	//if(5 % 2 == 0) {
    		//System.out.println("짝수입니다.");
    	//} else {
    		//System.out.println("홀수입니다.");
    	//}
    	
    	// 75300 원.
    	// 5만원 => ?개, 1만원 => ?개, 5천원 => ?개
    	// 1천원 => ?개, 5백원 => ?개, 1백원 => ?개
    	
    	//75300원 5만원 1개, 1만원 2개, 5천원 1개, 1백원 3개.
    	Scanner scn = new Scanner(System.in);
    	int result = 75300 / 50000;
    	int result2 = 75300 % 50000;
    	int result3 = result2 / 10000;
    	int result4 = result2 % 10000;
    	int result5 = result4 / 5000;
    	int result6 = result4 % 5000;
    	int result7 = result6 / 100;
    	int result8 = result6 % 100;
    	
    	System.out.printf("5만원권 %5d개, 1만원권 %5d개, 5천원권 %5d개, 1백원 %5d개입니다.", result, result3, result5, result7);
	}
}
// 오렌지 127개 10개씩 담을 수 있는 상자., 5개씩 담을 수 있는 상자.
// 영수증 물건의 가격과 현금. [현금]10000원, [물건가격]7500원, [부가세]750원, [잔돈]2500원.