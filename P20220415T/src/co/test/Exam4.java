package co.test;

//클래스의 생성과 필드, 메소드, 생성자.
public class Exam4 {
	// 친구의 이름, 생일, 연락처(중복값이 없는 키의 역할)
	private String name;
	private String birth;
	private String phone;
	
	public Exam4() {
		
	}
		
	
	public Exam4(String name, String birth, String phone) {
		super();
		this.name = name;
		this.birth = birth;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

    public void showInfo() {
    	System.out.printf("%4s" + "%4s" + "%4s ", name, birth, phone);
    }
	
	
	
	
	
}
