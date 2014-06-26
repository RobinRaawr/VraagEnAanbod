package app;

import javax.swing.JFrame;

public class Main {
	
	private FakeDatabase fakeDatabase;
	// TODO Field voor OverviewFrame

	public static void main(String[] args) {		
		new Main();
	}	
	
	public Main(){
		new OverviewFrame(); // Dit roept de frame aan, en in de frame wordt de panel geconnected zegmaar
		fakeDatabase = new FakeDatabase(); 
	}
	
	public FakeDatabase getFakeDatabase(){
		return fakeDatabase;
	}
	
	// TODO Getter voor overviewFrame.
	
	public static class OverviewFrame extends JFrame { // Deze alleen is een JFrame omdat hij hiermee begint, en dus de frame wordt aangemaakt en doorgegeven
		
		private OverviewPanel overviewPanel;
		private NewEventPanel neweventPanel;
		
		public OverviewFrame(){
			super("Vraag en Aanbod");
		
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
	}

}
