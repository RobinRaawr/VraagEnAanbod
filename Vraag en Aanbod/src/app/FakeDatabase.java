package app;

import java.util.ArrayList;

public class FakeDatabase {

	private ArrayList<User> userList = new ArrayList<User>();
	private ArrayList<Event> eventList = new ArrayList<Event>();
	
	public FakeDatabase(){
		
	}
	
	public ArrayList<Event> getAllEvents(){
		return eventList;
	}
	
	public ArrayList<User> getAllUsers(){
		return userList;
	}
	
}
