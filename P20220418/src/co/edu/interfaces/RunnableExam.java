package co.edu.interfaces;

//구현클래스 클래스명

interface Runnable {
	public void run();
}

class RunClass implements Runnable {
	@Override
	public void run() {
		System.out.println("움직입니다.");
	}
}

public class RunnableExam {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
//			runnable = run();
																						
  }
}