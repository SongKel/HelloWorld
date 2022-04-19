package co.edu.project;

public class MySqlDAO implements DAO {

	@Override
	public void insert() {
           System.out.println("입력");
	}

	@Override
	public void update() {
        System.out.println("수정");
	}

	@Override
	public void delete() {
        System.out.println("삭제");
	}

	@Override
	public void list() {
        System.out.println("리스트");
	}

	
}
