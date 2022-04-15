package co.edu.statics;

public class PersonEx {
    public static void main(String[] args) {
		Person p1 = new Person("234563-12344", "홍길동");
		p1.name = "김길동";
//		p1.ssn = "3456-8123"; //ssn은 final값이므로 다르게 입력x
		
		Person p2 = new Person("123456-8799", "김길동");
	}
}
