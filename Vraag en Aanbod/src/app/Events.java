package app;

public class Events {
	 
	int ID;
	public String creator; // User Object
	public String subject;
	public String startTime;
	public String endTime;
	public String date;
	
	// heb het public gemaakt zodat ik geen get-methods hoef te maken, aangezien toch alleen ik zelf hiermee rommel

	public Events(String creator, String startTime, String endTime, String date){
		
		this.creator = creator;
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
	}
}
