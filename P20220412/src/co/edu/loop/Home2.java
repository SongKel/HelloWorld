package co.edu.loop;

import java.util.Scanner;

public class Home2 {
	public static void main(String[] args) {
		// 임의의 값 범위 (1: 가위, 2:바위, 3:보)
		// 사용자 입력 값: 가위:1, 바위:2, 보:3
		// 이기는 경우: 1=2, 2=3, 3=1 의 경우
		// 이외의 경우는 짐.
		// 가위(1) => You Win. / You Lose.
		Scanner scn = new Scanner(System.in);
		System.out.println("@ 가위 바위 보 게임 @");
		System.out.println("1.가위 2.바위 3.보");
		System.out.println("가위 바위 보 중에서 하나를 고르시오");

		int com = 0;
		int user = scn.nextInt();
		int randomVal = (int) (Math.random() * 3) + 1;

		com = randomVal;
		System.out.println("You " + user);
		System.out.println("Com " + com);
		
		if(user == 1) {
			if(com == 2) {
				System.out.println("You Lose");
			}
			else if(com == 3) {
				System.out.println("You Win");
			}
			else if(com == 1){
				System.out.println("You Lose");
			} 
			if(user == 2) {
				if(com == 1) {
					System.out.println("You Win");
				}
				else if(com == 3) {
					System.out.println("You Lose");
				}
				else if (com == 2){
					System.out.println("You Lose");
				} 
				if(user == 3) {
					if(com == 1) {
						System.out.println("You Lose");
					}
					else if(com == 2) {
						System.out.println("You Win");
					}
					else if(com == 3){
						System.out.println("You Lose");
					}
				}
			}
		}
	}
}