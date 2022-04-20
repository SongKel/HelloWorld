package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 배열의 기능을 활용
public class FriendServiceArray implements FriendService {
	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	@Override
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(friends[i].getName())) {
				friends[i].setPhone(friend.getPhone());
			}
		}
	}

	@Override
	public void reFriend(String name) {
         for (int i = 0; i < friends.length; i++) {
   //     	 Friend findFriend = (Friend) friends
        	 
         }
	}

	@Override
	public Friend findFriend(String name) {
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		// TODO Auto-generated method stub
		return null;
	}

}
