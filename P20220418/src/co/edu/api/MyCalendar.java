package co.edu.api;

public class MyCalendar {
    public static void main(String[] args) {
		String y = "2022";
		String m = "4"; //"06" 또는 "6";
		
		showCal(y, m);		
	}

	private static void showCal(String year, String month) {
		// 달력출력		
		System.out.println("         " + year + "년" + " " + " " +  month + "월");		
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"}; 
		System.out.println("============================");
   
		int lnth = getLastday(month);
		int[] intAry = new int[lnth];
		
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = i +1;
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

	private static int getDayInfo(String month) {
		switch (month) {
		case "1":
			return 6;
		case "2":
			return 2;
		case "3":
			return 2;
		case "4":
			return 5;
		case "5":
			return 0;
		case "6":
			return 3;
		case "7":
			return 5;
		case "8":
			return 1;
		case "9":
			return 4;
		case "10":
			return 6;
		case "11":
			return 2;
		case "12":
			return 4;
		default:
			return 0;
		}

		
	}

	private static int getLastday(String month) {
		switch (month) {
		case "1":
			return 31;
		case "2":
			return 28;
		case "3":
			return 31;
		case "4":
			return 30;
		case "5":
			return 31;
		case "6":
			return 30;
		case "7":
			return 31;
		case "8":
			return 31;
		case "9":
			return 30;
		case "10":
			return 31;
		case "11":
			return 30;
		case "12":
			return 31;
		default:
			return 0;
		}
		
	}
}
