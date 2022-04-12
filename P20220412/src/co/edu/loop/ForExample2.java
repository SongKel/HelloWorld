package co.edu.loop;

public class ForExample2 {
    public static void main(String[] args) {
		// 1 ~ 100 반복..
    	// 31번째 종료.
    	int sum = 0;    	
        for (int i = 1; i <= 100; i++) {
        	if (i == 31) {
        		break;
        	}
        	if (i % 2 == 0) {
        		System.out.println("현재 i의 값 => " + i);
        		continue;
        	}
        	sum = sum + i;
        }
        
        System.out.println("sum => " + sum);
	}
}
