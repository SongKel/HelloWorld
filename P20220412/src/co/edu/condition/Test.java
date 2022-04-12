package co.edu.condition;

public class Test {
    public static void main(String[] args) {
		// 임의의 값 범위 (1~6: 주사위 면의 갯수.)
    	// 주사위 맞추기 게임
    	// 임의의 값 범위 (1: 가위, 2: 바위, 3: 보)
    	// 사용자 입력값: 가위(1), 바위(2), 보(3)
    	// 가위바위보 게임
    	// 이기는 경우: 1=2, 2=3, 3=1 의 경우
    	// 이외의 경우는 짐.
    	int randomVal = (int) (Math.random() * 6) + 1;
    	System.out.println(randomVal);
        
	}
}
