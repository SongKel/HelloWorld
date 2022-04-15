package co.edu.app;

public class AccountEx {
	// 메뉴: 1.계좌생성 2.입금 3.출금 4.목록조회 5.종료
	// Accont: 계좌번호, 예금주, 잔액
	// AccontApp: 1.계좌생성 2.입금 3.출금 4.목록조회 5.종료
	// AccontExe: AccountApp 클래스의 인스턴스 호출 execute();
	public static void main(String[] args) {
		AccountApp app = new AccountApp();
		app.execute();
	}
}
