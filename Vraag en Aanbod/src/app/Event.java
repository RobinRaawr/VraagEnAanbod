package app;

public class Event {
	 
	private String creator; // User Object
	private String subject;
	private String startTime;
	private String endTime;
	private String date;
	private String vraanbod;
	

	public Event(String creator, String subject, String startTime, String endTime, String date, String vraanbod){
		
		this.creator = creator;
		this.subject = subject;
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
		this.vraanbod = vraanbod;
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
	public String getVraanbod(){
		return vraanbod;
	}
}
