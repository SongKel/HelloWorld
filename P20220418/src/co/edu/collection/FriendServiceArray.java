package co.edu.collection;


import java.util.Scanner;

import co.edu.friend.Friend;

// 배열의 기능을 활용
public class FriendServiceArray implements FriendService {	
	Friend[] friends = new Friend[10];
	@Override
	public void addFriend(Friend friend) {				
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] == null) {
			friends[i] = friend;
			break;
			}
		}
	}

	@Override
	public void modFriend(Friend friend) {
         for(int i = 0; i < friends.length; i++) {
        	 if(friends[i] != null && friends[i].getName().equals(friends[i].getName())) {
        		 friends[i] = friend;
        	 }
         }
	}

	@Override
	public void reFriend(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName() == name) {
				friends[i] = 
				
	}

	@Override
	public Friend findFriend(String name) {
		return null;
	}

}
