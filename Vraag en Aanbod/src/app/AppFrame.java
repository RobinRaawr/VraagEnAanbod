package app;

import javax.swing.JFrame;

public class AppFrame extends JFrame {
	
	private	static	FakeDatabase 	fakeDatabase;
	private static 	OverviewPanel 	overviewPanel; // Uitzoeken waarom static
	private static	NewEventPanel 	neweventPanel;
	private static	AppPanel 		activePanel;

	public static void main(String[] args) {		
		AppFrame frame = new AppFrame();
		FakeDatabase fakeDatabase = frame.getFakeDatabase(); // Zo kunnen we gebruik maken van de database.
		
		fakeDatabase.insertEvent("Robin", "Wiskunde B", "12:00", "13:00", "01-07-2014");
		
		
				
		fakeDatabase.getAllEvents();
		frame.refreshActivePanel();
		
//		for (Event event : fakeDatabase.getAllEvents()){
//			System.out.print(event.getCreator() +(" ") + event.getSubject()+(" ") + event.getStartTime()+(" ") + event.getEndTime()+(" ") + event.getDate());
//		}
	}	
	
	public AppFrame() {
		super("Vraag en Aanbod");		
		
		fakeDatabase 	= 	new FakeDatabase(this);			
		overviewPanel 	= 	new OverviewPanel(this);
		neweventPanel 	= 	new NewEventPanel(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Zorg dat het kruisje daadwerkelijk de app sluit.
		this.setSize(360, 576); // Eerst de size dan pas locatie zetten anders nope
		this.setLocationRelativeTo(null); // Zorgt dat de app in het midden begint en niet links boven	< Dont know why null.. just dis		
		this.setActivePanel(overviewPanel); // Hier wordt de overviewpanel gelinkt met AppFrame

		revalidate();
		
		System.out.println("de App zijn Frame + overviewpanel is gemaakt");
		
	}
	
	public FakeDatabase getFakeDatabase() {
		return fakeDatabase;
	}
	
	public OverviewPanel getOverviewPanel(){
		return overviewPanel;
	}
	
	public void setActivePanel(AppPanel appPanel) {
		activePanel = appPanel; // Onthoud welke app-panel wordt weergeven.
		refreshActivePanel();
	}

	public void refreshActivePanel() {
		if (activePanel == null)
			return; // Stopt ALTIJD de huidige method.
		
		activePanel.refresh();
		setContentPane(activePanel);
		revalidate();
	}
	
	@Override
	public void revalidate()
	{
		super.revalidate();
		System.out.println("AppFrame >> revalidate()");
	}
}
