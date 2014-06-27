package app;

import javax.swing.JFrame;

public class AppFrame extends JFrame {
	
	private FakeDatabase 	fakeDatabase;
	private OverviewPanel 	overviewPanel;
	private NewEventPanel 	neweventPanel;

	public static void main(String[] args) {		
		new AppFrame();
	}	
	
	public AppFrame(){
		super("Vraag en Aanbod");
		new AppFrame(); // Dit roept de frame aan, en in de frame wordt de panel geconnected zegmaar
		fakeDatabase = new FakeDatabase(); 		
		
		overviewPanel = new OverviewPanel(this);
		neweventPanel = new NewEventPanel();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Zorg dat het kruisje daadwerkelijk de app sluit.
		this.setSize(360, 576); // Eerst de size dan pas locatie zetten anders nope
		this.setLocationRelativeTo(null); // Zorgt dat de app in het midden begint en niet links boven	< Dont know why null.. just dis		
		this.setContentPane(overviewPanel); // Hier wordt de overviewpanel gelinkt met overviewframe
		this.revalidate(); // JFrame's refresh methode	
		System.out.println("de App zijn Frame + overviewpanel is gemaakt");
		
	}
	
	public FakeDatabase getFakeDatabase(){
		return fakeDatabase;
	}



}
