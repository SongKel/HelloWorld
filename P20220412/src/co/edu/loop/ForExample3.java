package co.edu.loop;

public class ForExample3 {
	public static void main(String[] args) {
		// 1 ~ 100번 반복.
		// 최초로 1000보다 큰 값중 최소값을 구하라.
		int sum = 0;
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			if (sum >= 1000) {
				cnt = i;
				break;
			}
			sum = sum + i;
		}
		System.out.println("1000보다 큰 최소합계: " + sum + ", 순번: " + cnt);

		// 1 ~ 10번을 반복.
		// sum = sum * 1;
		int sum1 = 1; // 곱하기는 1로 설정
		for (int i = 1; i <= 10; i++) {
			sum1 = sum1 * i;
		}

		System.out.println("1 ~ 10까지 곱한 결과=> " + sum1);

		// 숫자 100의 약수를 출력하도록
		
		for (int i = 1; i <= 100; i++) {
			if (100 % i == 0) {
				System.out.println(i);
			}
		}
	}
}
