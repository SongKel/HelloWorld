package co.test;


// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		// 임의의 값 10개 => 평균.	
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()* 10) + 1;
		}
		
		double avg = 0;			
		// 평균보다 큰 값의 요소들을 새로운 배열에 저장
		int[] newAry = new int[10];
		for(int i = 0; i < numbers.length; i++) {			
			if(numbers[i] >= avg) {
				for(int j = 0; j < newAry.length; j++) {
					if(newAry[j] == 0) {
						newAry[j] = numbers[i];
						break;
					}				
				}				
			}
			System.out.println(avg);
		}		
	}
}
