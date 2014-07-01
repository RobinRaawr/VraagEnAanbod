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
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Zorg dat het kruisje daadwerkelijk de app sluit.
		this.setSize(360, 576); // Eerst de size dan pas locatie zetten anders nope
		this.setLocationRelativeTo(null); // Zorgt dat de app in het midden begint en niet links boven	< Dont know why null.. just dis
		this.setResizable(false);
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
