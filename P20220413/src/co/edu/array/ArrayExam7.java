package co.edu.array;

public class ArrayExam7 {
	public static void main(String[] args) {

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int month = 6;
		int lnth = getLastDay(month);
		int[] intAry = new int[lnth];

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = i + 1;
		}
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);

		}
		System.out.println();
		int spaces = getDayInfo(month);
		for (int i = 0; i < spaces; i++) {
			System.out.printf("%4s", " ");
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("%4d", intAry[i]);
			if ((i + spaces) % 7 == 6) {
				System.out.println();
			}
		}
	}

	public static int getLastDay(int month) {
		switch (month) {
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		default:
			return 0;
		}
	}

	public static int getDayInfo(int month) {
		switch (month) {
		case 2:
			return 2;
		case 3:
			return 2;
		case 4:
			return 5; // 요일정보.
		case 5:
			return 0;
		case 6:
			return 3;
		default:
			return 0;
		}
	}
}