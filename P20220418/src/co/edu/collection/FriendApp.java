package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 친구목록저장하기 위한 App.
// 추가 수정 삭제 조회
// 1.배열 2.컬렉션 <= 인터페이스 구현.
public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//    	FriendService service = new FriendServiceArray();		
		FriendService service = new FriendServiceList();

		// 추가 수정 삭제 조회 => 컨트롤기능
		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.남자 6.여자 7.종료");
			System.out.println("선택>> ");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("이름입력>> ");
				String name = scn.next();
				System.out.println("번호입력>> ");
				String phone = scn.next();
				System.out.println("성별입력>> ex)남자 / 여자");
				String gender = scn.next();
				Gender gen = Gender.MEN;
				if (gender.startsWith("남")) {
					gen = Gender.MEN;
				} else if (gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(name, phone, gen);
				service.addFriend(friend);
			} else if (menu == 2) {
				System.out.println("변경할 이름을 입력하세요>> ");
				String name = scn.next();
				System.out.println("변경할 연락처를 입력하세요>> ");
				String phone = scn.next();
				Friend friend = new Friend(name, phone);
				service.modFriend(friend);
			} else if (menu == 3) {
				System.out.println("삭제할 이름을 입력하세요>> ");
				String name = scn.next();
				service.reFriend(name);
			} else if (menu == 4) {
				System.out.println("조회할 이름>> ");
				String name = scn.next();
				Friend searchFriend = service.findFriend(name);
				System.out.println(searchFriend);
			} else if (menu == 5) { // 남자친구리스트
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				for (Friend friend : list) {
					System.out.println(friend.toString());
				}
			} else if (menu == 6) { // 여자친구리스트
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for (Friend friend : list) {
					System.out.println(friend.toString());
				}
			} else {
				System.out.println("프로그램을 종료");
				break;
			}
		}

		// service.addFriend(null);
		// service.modFriend(null);

	}

	private static Friend reFriend(String name) {

		return null;
	}

	private static Object Object(String name) {

		return null;
	}

}
