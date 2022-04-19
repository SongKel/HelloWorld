package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

// 친구목록저장하기 위한 App.
// 추가 수정 삭제 조회
// 1.배열 2.컬렉션 <= 인터페이스 구현.
public class FriendApp {
    public static void main(String[] args) {
		FriendService service = new FriendServiceArray();
		Scanner scn = new Scanner(System.in);
//		FriendService service = new FriendServiceList();
    	// 추가 수정 삭제 조회 => 컨트롤기능
		while(true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회");
			System.out.println("선택>> ");
			int menu = scn.nextInt();
			if(menu == 1) {
		     System.out.println("이름입력>> ");
		     String name = scn.next();
		     System.out.println("번호입력>> ");
		     String number = scn.next();
		     Friend friend = new Friend(name, number);
		     service.addFriend(friend);
			}else if(menu == 2) {
				System.out.println("수정할 이름을 입력하세요>> ");
				String name = scn.next();
				System.out.println("변경할 연락처를 입력하세요>> ");
				String anumber = scn.next();
				Friend afriend = new Friend(name, anumber);
				service.modFriend(afriend);
			}else if(menu == 3) {
				System.out.println("삭제할 이름을 입력하세요>> ");
				String name = scn.next();
				Friend friend = reFriend(name);
			}
		}
		
		//service.addFriend(null);
		//service.modFriend(null);
		
	}

	private static Object (String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
