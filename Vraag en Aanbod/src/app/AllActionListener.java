package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AllActionListener {

	public static class TextDisplayHandler implements ActionListener {
		@Override public void actionPerformed(ActionEvent arg0) {
			System.out.println("Er is op de knop gedrukt omg");
		}
	}

	public static class NavigateToNewEventHandler implements ActionListener {
		
		Main.OverviewFrame frame;
		NewEventPanel neweventpanel = new NewEventPanel();
		
		public NavigateToNewEventHandler(Main.OverviewFrame frame) {
			this.frame = frame;
		}
		
		@Override public void actionPerformed(ActionEvent arg0) {
			frame.setContentPane(neweventpanel);
			System.out.println("Op naar Nieuw Event Scherm");
			frame.revalidate();
		}
		
	}
}
