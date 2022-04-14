package co.edu;

public class BoardList {
	private Board[] boards;

	// 배열크기 초기화
	public void init(int size) {
		boards = new Board[size];
	}

	// 배열에 한건 입력
	public int addBoard(Board board) {
//		boolean check = false;
		int errorCase = -1; // 저장공간이 없음
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				errorCase = 1; // 동일한 값이 있을경우의 에러
				break;
			}
			if (boards[i] == null) {
				boards[i] = board;
				errorCase = 0; // 정상처리
				break;
			}
		}
		return errorCase;
	}

	// 수정: 게시글번호 찾아서 내용, 제목 변경
	public boolean modifyBoard(Board board) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				break;
			}
		}
		return false;
	}

	// 삭제: 게시글번호

	public void removeBoard(int bNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == bNo) {
				boards[i] = null; // 배열위치 null대입
				break;
			}
		}
	}

	// 한건조회
	public Board searchBoard(int bNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == bNo) {
				int currentCnt = boards[i].getSearchCnt();
				boards[i].setSearchCnt(currentCnt + 1);
				return boards[i];
			}
		}
		return null;
	}

	// 게시글목록
	public Board[] boardList() {
		return boards;
	}

}
