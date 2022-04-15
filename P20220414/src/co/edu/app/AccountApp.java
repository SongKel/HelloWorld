package co.edu.app;

import java.util.Scanner;

public class AccountApp {
	Account[] account = new Account[100]; // 계좌정보를 저장하기 위한 배열.	
	public void execute() {		
		Scanner scn = new Scanner(System.in);
		while(true) {		
			System.out.println("===========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 |5.종료");
			System.out.println("===========================================");
			System.out.println("선택>> ");
			int menu = 0;
			int balance = 0;
			menu = scn.nextInt();
			scn.nextLine();
			
			if (menu == 1) {
				System.out.println("계좌생성");
				System.out.println("=======");
				System.out.println("계좌번호입력>> ");
				String acn = scn.next();
			    System.out.println("계좌주 입력>> ");
			    String name = scn.next();
			    System.out.println("초기입금액>> ");
			    balance = scn.nextInt();
			    scn.nextLine();
			    System.out.println("결과: 계좌가 개설되었습니다.");
			    	
				Account vo = new Account(acn, name, balance);
			    createAccount(vo);
			
			}else if(menu == 2) {
				System.out.println("=========");
				System.out.println("계좌목록");
				System.out.println("=========");
				for(Account account : accountList()) {
					if (account != null) {
						account.getInfo();
					}
				}
			}else if(menu == 3) {
				System.out.println("=============");
				System.out.println("예금");
				System.out.println("=============");
				System.out.println("예금하실 계좌번호: ");
				String acn = scn.next();
				
				System.out.println("예금하실 금액: ");
				int dep = scn.nextInt();
				scn.nextLine();
				System.out.println("결과: 예금이 완료되었습니다.");					
				
			}else if(menu == 4) {
				withdraw();
			}else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("end of prog");
	}
	
	// 계좌생성 시 실행 메소드
	public void createAccount(Account vo) {
		for(int i = 0; i < account.length; i++) {
			if(account[i] == null) {
				account[i] = vo;
				break;
			}
		}
	}
	// 입금처리 시 실행 메소드
	public void deposit(Account dep) {
											
	}
	// 출금처리 시 실행 메소드
	public void withdraw() {
		
	}
	// 전체목록 실행 메소드
	public Account[] accountList() {
		return account;
	}
}
