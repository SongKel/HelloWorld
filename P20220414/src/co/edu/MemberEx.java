package co.edu;

import java.util.Scanner;

public class MemberEx {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "사용자1", "010-2343-4543", 20);
//		m1.memberAge = -25;
		m1.setMemberAge(-25);
		m1.setMemberId("user01");
//		System.out.println("나이 " + m1.getMemberAge());
//		System.out.println("ID: " + m1.getMemberId());
//		m1.showInfo();
		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[1];

		// 사용자입력
		for (int i = 0; i < members.length; i++) {
			System.out.println("아이디 이름 연락처 나이 순서대로 입력하세요.");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			int age = Integer.parseInt(scn.next());
			Member newMember = new Member(id, name, phone, age);

			members[i] = newMember;
		}

		// 1. 조회(회원이름), 2. 변경(아이디, 연락처), 3. 조회(입력한 나이보다 큰 회원), 4. 종료
		while (true) {
			System.out.println("1. 조회(회원이름), 2. 변경(아이디, 연락처), 3. 조회(입력한 나이보다 큰 회원), 4. 종료");
			System.out.println("선택> ");
			int menu = scn.nextInt();// Integer.parseInt(scn.nextLine());
			scn.nextLine();

			if (menu == 1) {
				System.out.println("1. 조회할 회원 이름");
				String name = scn.next();
				for (Member member : members) {
					if (member.getMemberName().equals(name)) {
						member.showInfo();
					}
				}

			} else if (menu == 2) {
				System.out.println("2. 아이디 입력 ");
				String id = scn.next();
				System.out.println("변경할 연락처");
				String phone = scn.next();

				for (Member member : members) {
					if (member.getMemberId().equals(id)) {
						member.setMemberPhone(phone);
						break;
					}
				}

			} else if (menu == 3) {
				System.out.println("나이입력> ");
				int age = scn.nextInt();
				scn.next();
				for (Member member : members) {
					if (member.getMemberAge() > age) {
						member.showInfo();
					}
				}

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				for (Member member : members) {
					member.showInfo();
				}

				System.out.println("end of prog.");
			}
		}
	}
}