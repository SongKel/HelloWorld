package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

public interface FriendService {
	public int ADD = 1;
	public int MOD = 2;
	public int RE = 3;
	public int SEARCH = 4;
	public int FIND_MEN = 5;
	public int FIND_WOMEN = 6;
	
	// 추가 수정 삭제 조회
	public void addFriend(Friend friend);

	public void modFriend(Friend friend);

	public void reFriend(String name);

	ArrayList<Friend> findGender(Gender gender);

	Friend findFriend(String name);
	
}
