package app;

import javax.swing.JFrame;

public class AppFrame extends JFrame {
	
	private	static	FakeDatabase 	fakeDatabase;
	private static 	OverviewPanel 	overviewPanel; 
	private static	NewEventPanel 	neweventPanel;
	private static	AppPanel 		activePanel;
	
	// De bovenstaande field zijn tot geen enkele instatie gerelateerd, oftewel je hoeft er geen instanties van te maken

	public static void main(String[] args) {		
		AppFrame frame = new AppFrame();
		
		FakeDatabase fakeDatabase = frame.getFakeDatabase(); // Zo kunnen we gebruik maken van de database.
		
		
		fakeDatabase.insertEvent("Robin", "Wiskunde B", "12:00", "13:00", "01-07-2014", "Vraag");
		fakeDatabase.insertEvent("Niels", "Scheikunde", "11:00", "11:30", "04-07-2014", "Vraag");
		fakeDatabase.insertEvent("Mariska", "Natuurkunde", "15:00", "15:45", "03-07-2014", "Aanbod");
		fakeDatabase.insertEvent("Boris", "Wiskunde A", "11:00", "15:00", "02-07-2014", "Vraag");
		fakeDatabase.insertEvent("Sander", "Aardrijkskunde", "15:00", "16:15", "05-07-2014", "Aanbod");
		fakeDatabase.insertEvent("Merel", "Nederlands", "11:00", "16:50", "06-07-2014", "Aanbod");
		fakeDatabase.insertEvent("Jeroen", "Economie", "12:00", "13:00", "05-07-2014", "Aanbod");
		fakeDatabase.insertEvent("Willem", "Engels", "14:00", "16:00", "03-07-2014", "Vraag");
		fakeDatabase.insertEvent("Jan", "Wiskunde B", "11:00", "16:00", "02-07-2014", "Vraag");
		fakeDatabase.insertEvent("Paula", "Biologie", "10:00", "15:00", "04-07-2014", "Vraag");
		fakeDatabase.insertEvent("Nico", "Natuurkunde", "11:00", "17:00", "03-07-2014", "Aanbod");
				
		fakeDatabase.getAllEvents();
		frame.refreshActivePanel();
	}	
	
	public AppFrame() {
		super("Vraag en Aanbod");		
		
		fakeDatabase 	= 	new FakeDatabase(this);			
		overviewPanel 	= 	new OverviewPanel(this);
		neweventPanel 	= 	new NewEventPanel(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(360, 576); 
		this.setLocationRelativeTo(null); 
		this.setResizable(false);
		this.navigateTo(overviewPanel); // Hier wordt de overviewpanel gelinkt met AppFrame

		revalidate();
		
	}
	
	public FakeDatabase getFakeDatabase() {
		return fakeDatabase;
	}
	
	public OverviewPanel getOverviewPanel(){
		return overviewPanel;
	}
	
	public void navigateTo(AppPanel appPanel) {
		activePanel = appPanel; // Onthoud welke app-panel wordt weergeven.
		refreshActivePanel();
	}

	public void refreshActivePanel() {
		if (activePanel == null)
			return; // Als we dit weg laten, dan krijgen we een nullpointer		
		
		activePanel.refresh();
		setContentPane(activePanel);
		revalidate();
	}	
}

