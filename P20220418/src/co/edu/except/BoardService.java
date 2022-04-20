package co.edu.except;

public interface BoardService {
    public int ADD = 1;
    public int MOD = 2;
    public int RE = 3;
    public int SEARCH = 4;
    public int LIST = 5;
    
    public void addBoard(Board board);
    
    public void modBoard(Board board);
    
    public void reBoard(String writer);
    
    public void findBoard(int boardNo);
    
    public void listBoard(String writer);
}
