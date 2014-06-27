package app;

public class Event {
	 
	int ID;
	private String creator; // User Object
	private String subject;
	private String startTime;
	private String endTime;
	private String date;
	

	public Event(String creator, String subject, String startTime, String endTime, String date){
		
		this.creator = creator;
		this.subject = subject;
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
	}
	
	public String getCreator(){
		return creator;
	}

	public String getSubject() {
		return subject;
	}

	public String getStartTime() {
		return startTime;	}

	public String getEndTime() {
		return endTime;
	}

	public String getDate() {
		return date;
	}
}
