package co.edu.statics;

public class Singleton {
    
	private static Singleton singleton = new Singleton(); //정적필드
	
	private Singleton() { //생성자
		
	}
	
	public static Singleton getInstance() { //정적매소드
		return singleton;
	}
}
