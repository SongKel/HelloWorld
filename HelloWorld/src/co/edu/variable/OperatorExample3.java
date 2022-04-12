package co.edu.variable;

import java.util.Scanner;

public class OperatorExample3 {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int money, price, change, vat, value;
		
		System.out.println("받은 돈: ");
		money = scn.nextInt();
		
		System.out.println("상품의 총액: ");
		price = scn.nextInt();
		
		value = (int) (price / 1.1);
		vat = price - value;
		change = money - price;
		
		System.out.println("부가세: " + (int)vat + "원");
		System.out.println("잔돈: " + change + "원");
		
	}
}
