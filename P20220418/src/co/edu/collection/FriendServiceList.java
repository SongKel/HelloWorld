package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 컬렉션 ArrayList
public class FriendServiceList implements FriendService {

	ArrayList<Friend> friends = new ArrayList<Friend>();
	
	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);
	}

	@Override
	public void modFriend(Friend friend) {
		for(int i = 0; i < friends.size(); i++) {
//			Friend findFriend = (Friend) friends.get(i);
			if(friends.get(i).getName().equals(friend.getName())) {
				friends.get(i).setPhone(friend.getPhone());
				break;
			}
		}
	}

	@Override
	public void reFriend(String name) {
		for(int i = 0; i < friends.size(); i++) {
			//if(friends.get(i).getName().equals())
			if(friends.get(i).getName().equals(name)) {
				friends.remove(i);
				break;
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		for(int i = 0; i < friends.size(); i++) {
			if(friends.get(i).getName().equals(name)) {
				friends.get(i);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend>list = new ArrayList<Friend>();
		for(int i =0; i < friends.size(); i++) {
			if(friends.get(i).getGender() == gender) {
				//열거형타입 클래스타입 같은 참조타입
				//기본타입 == 비교연산자
				//열거형 ==비교연산자로 비교
				list.add(friends.get(i));
			}
		}
		return list;
	}
	
	
	
	
	
	
	
	
}
