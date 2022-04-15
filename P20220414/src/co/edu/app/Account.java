package co.edu.app;

public class Account {
    // 필드: 계좌번호12-222, 예금주, 잔액 
    private String acn;
    private String name;
    private int balance;    
    
	// 생성자:
	public Account(String acn, String name, int balance) {
		this.acn = acn;
		this.name = name;
		this.balance = balance;
		
	}
	// Getter,Setter

	public String getAcn() {
		return acn;
	}

	public void setAcn(String acn) {
		this.acn = acn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	public void getInfo() {
		System.out.printf("%15s %5s %10d\n", this.acn, this.name, this.balance);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
