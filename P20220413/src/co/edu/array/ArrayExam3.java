package co.edu.array;

public class ArrayExam3 {
    public static void main(String[] args) {
		int[] intAry = {78, 83, 88, 92, 63, 44, 55};
		
		// 요소의 합을 구하는 코드. sum 선언.
		// double avg 평균.
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		for(int i = 0; i < intAry.length; i++) { // length = Ary의 수가 늘어나는만큼 자동으로 늘려줌.
			if(intAry[i] % 2 == 0)
			sum += intAry[i];	
			cnt++;
		}
		avg = 1.0 * sum / cnt;
//		avg = sum / 5.0; // sum의 값에서 구하기때문에 for문 밖으로. sum=정수 double로 변환.
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}
}
