package co.edu.except;

public class Board {

	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String date;
	
	public Board(int boardNo, String title, String content, String writer, String date) {
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
				
	}
    public Board(int boardNo, String content) {
    	this.boardNo = boardNo;
    	this.content = content;
    }
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Board[게시글번호= " + boardNo + ", 제목= " + title + ", 내용= " + content + ", 작성자= " + writer + ", 작성일자= " + date + "]";
	}
	
}
