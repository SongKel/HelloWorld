package co.edu.interfaces;

public class RemoteExample {
    public static void main(String[] args) {
		// 상속관계에서는 부모클래스의 참조변수 자식클래스의 인스턴스가 할당.
    	
    	RemoteControl rc = null;
//    	rc = new Television(); //RemoteControl 구현하는 Television.
    	rc = new Audio(); // powerOn, powerOff
    	
    	rc.turnOn();
    	rc.volumeUp();
    	rc.volumeDown();
    	rc.turnOff();
    	
    	RemoteControl.changeBattery();
    	
	}
}
