package co.edu.condition;

public class IfExample2 {
	public static void main(String[] args) {
		int num = 18;

		// 2의 배수, 3의 배수, 2,3의 공통배수.
		if ((num % 2 == 0 && num % 3 == 0)) {
			System.out.println(num + " = 2와 3의 공통배수");
		} else if (num % 2 == 0) {
			System.out.println(num + " = 2의 배수");
		} else if (num % 3 == 0) {
			System.out.println(num + " = 3의 배수");
		}
	}
}