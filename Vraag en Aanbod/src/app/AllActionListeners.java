package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AllActionListeners {

	public static class TextDisplayHandler implements ActionListener {
		@Override public void actionPerformed(ActionEvent arg0) {
			System.out.println("Er is op de knop gedrukt omg");
		}
	}

	public static class NavigateToNewEventHandler implements ActionListener {
		
		AppFrame frame;
		NewEventPanel neweventpanel;
		
		public NavigateToNewEventHandler(AppFrame frame) {
			this.frame = frame;
			neweventpanel = new NewEventPanel(frame);
		}
		
		@Override public void actionPerformed(ActionEvent arg0) {
			frame.setContentPane(neweventpanel);
			System.out.println("Op naar Nieuw Event Scherm");
			frame.revalidate();
		}
		
	}
}
