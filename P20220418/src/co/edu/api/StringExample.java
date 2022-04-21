package co.edu.api;

public class StringExample {
	public static void main(String[] args) {
		// 주민번호 => 생년월일-남/여 구분.

		// 950405-2345678 => 95년 4월 5일생, 여자입니다.
		// 991001-1234567 => 99년 10월 1일생, 남자입니다.
		// 9704051234567 => 97년 4월 5일생, 남자입니다.
		// 0505053456789 => 05년 5월 5일생, 남자입니다.
	String result = checkInfo("9704051234567");
		System.out.println(result);
	}

	public static String checkInfo(String number) {
        
		String year = number.substring(0, 2);
		String month = number.substring(2, 4);
		String date = number.substring(4, 6);
		String gender = number.substring(7, 8);
		switch(gender) {
		case "1": 
		case "3":
			gender = "남자";
			break;
		case"2":
		case"4":
			gender = "여자";
			break;
		}

		return year + "년 " + month + "월 " + date + "일생 " + gender + "입니다.";
	}
}
