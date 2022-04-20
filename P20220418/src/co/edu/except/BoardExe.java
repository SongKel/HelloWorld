package co.edu.except;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		BoardService service = new BoardApp();
		Scanner scn = new Scanner(System.in);
    	BoardApp app = new BoardApp();
		Board[] boards = new Board[5];
		while(true) {
			System.out.println("==============================================================");
			System.out.println("1.글등록 | 2.글수정 | 3.글삭제 | 4.글상세조회 | 5.전체글목록 | 6.종료");
			System.out.println("==============================================================");
			System.out.println("선택>> ");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("게시글번호>> ");
				int boardNo = scn.nextInt();
				System.out.println("제목>> ");
				String title = scn.next();
				System.out.println("내용>> ");
				String content = scn.next();
				System.out.println("작성자>> ");
				String writer = scn.next();
				System.out.println("작성일시>> ");
				String date = scn.next();
				System.out.println("정상적으로 처리되었습니다.");
				Board board = new Board(boardNo, title, content, writer, date);
				service.addBoard(board);
			}else if (menu == 2) {
				System.out.println("수정할 번호를 입력하세요>> ");
				int boardNo = scn.nextInt();
				System.out.println("수정할 내용을 입력하세요>> ");
				String content = scn.next();
				System.out.println("수정 완료.");
				Board board = new Board(boardNo, content);
				service.modBoard(board);
				
			}else if (menu == 3) {
				System.out.println("삭제할 글작성자를 입력하세요>> ");
				String writer = scn.next();
				System.out.println("삭제 완료.");
				service.reBoard(writer);
				
			}else if (menu == 4) {
				System.out.println("조회할 게시글번호를 입력하세요>> ");
				int boardNo = scn.nextInt();
				service.findBoard(boardNo);
		        
			
			}else if (menu == 5) {
				System.out.println("조회할 게시글의 작성자를 입력하세요>> ");
				String writer = scn.next();
				service.listBoard(writer);
			
			}else {
				System.out.println("시스템을 종료합니다.");
			}
		}
	}
}
