package app;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {		
		
		new OverviewFrame(); // Dit roept de frame aan, en in de frame wordt de panel geconnected zegmaar
				
	}	
	
	
	
	
	public static class OverviewFrame extends JFrame { // Deze alleen is een JFrame omdat hij hiermee begint, en dus de frame wordt aangemaakt
		
		private OverviewPanel overviewpanel = new OverviewPanel();	
		
		public OverviewFrame(){
			super("Vraag en Aanbod");
		
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Zorg dat het kruisje daadwerkelijk de app sluit.
			this.setSize(360, 576); // Eerst de size dan pas locatie zetten anders nope
			this.setLocationRelativeTo(null); // Zorgt dat de app in het midden begint en niet links boven	< Dont know why null.. just dis		
			this.setContentPane(overviewpanel); // Hier wordt de overviewpanel gelinkt met overviewframe
			this.revalidate(); // JFrame's refresh methode	
			System.out.println("Overvieuwframe + overviewpanel is gemaakt");
			
		}
	}

}
