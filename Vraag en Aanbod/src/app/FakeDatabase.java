package app;

import java.util.ArrayList;

public class FakeDatabase {

	private ArrayList<User> userList = new ArrayList<User>();
	private ArrayList<Event> eventList = new ArrayList<Event>();
	private AppFrame frame;
	
	public FakeDatabase(AppFrame frame){
		this.frame = frame;
	}
	
	public ArrayList<Event> getAllEvents(){
		return eventList;
	}
	
	public ArrayList<User> getAllUsers(){
		return userList;
	}

	public void insertEvent(String creator, String subject, String startTime, String endTime, String date) {
		eventList.add(new Event(creator, subject, startTime, endTime, date));
		System.out.println("Event toegevoegd. Aantal events: " + eventList.size());
		
		frame.refreshActivePanel(); // Refresh de app-panel die weergeven wordt.
	}
}
