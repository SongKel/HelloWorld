package co.edu.array;

public class ArrayExam2 {
    public static void main(String[] args) {
		int[] intAry = {10, 20, 30, 40, 50};
		int maxVal = 0;
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
			if(maxVal < intAry[i]) {
				maxVal = intAry[i];
			}
			sum += intAry[i];
		}
		
		System.out.println("최대값: " + maxVal);
		System.out.println("합계: " + sum);
	}
}
