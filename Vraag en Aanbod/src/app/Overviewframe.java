package app;

import javax.swing.JFrame;

public class Overviewframe extends JFrame {
	
	private Overviewpanel overviewpanel = new Overviewpanel();	
	
	public Overviewframe(){
		super("Vraag en Aanbod");
	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Zorg dat het kruisje daadwerkelijk de app sluit.
		this.setSize(360, 576); // Eerst de size dan pas locatie zetten anders nope
		this.setLocationRelativeTo(null); // Zorgt dat de app in het midden begint en niet links boven			
		this.setContentPane(overviewpanel);
		this.revalidate(); // JFrame's refresh methode	
		
		
		System.out.println("Overviewframe is gemaakt fgt");
	}
}
