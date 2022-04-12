package co.edu.loop;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum = sum + 3;
			// i = 1, sum = 3;
			// i = 2, sum = 6;
			// i = 3, sum = 9;
			// i = 4, sum = 12;
			// i = 5, sum = 15;
		}

		//System.out.println("sum => " + sum);

		// for(int i = 9; i >= 1; i--) {
		// System.out.println("3 * " + i + " = " + (3 * i));
		// }

		sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}						
		}
        
		System.out.println("sum => " + sum);		
	}
}
