package co.edu.except;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp implements BoardService {
	ArrayList<Board> list = new ArrayList<Board>();

	@Override
	public void addBoard(Board board) {
		list.add(board);
	}

	@Override
	public void modBoard(Board board) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == (board.getBoardNo())) {
				list.get(i).setContent(board.getContent());
				break;
			}
		}
	}

	@Override
	public void reBoard(String writer) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getWriter().equals(writer)) {
				list.remove(i);
				break;
			}
		}

	}

	@Override
	public void findBoard(int boardNo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == boardNo) {
				list.get(i);			
				System.out.println(list.get(i));
				break;
			}
		}

	}

	@Override
	public void listBoard(String writer) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getWriter().equals(writer)) {
				list.get(i);
				System.out.println(list.get(i));
			}
		}

	}

}
