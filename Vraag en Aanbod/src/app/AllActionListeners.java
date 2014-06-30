package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AllActionListeners {

	public static class NavigateToNewEventHandler implements ActionListener {
		
		AppFrame frame;
		NewEventPanel neweventpanel;
		
		public NavigateToNewEventHandler(AppFrame frame) {
			this.frame = frame;
			neweventpanel = new NewEventPanel(frame);
		}
		
		@Override public void actionPerformed(ActionEvent arg0) {
			frame.setContentPane(neweventpanel);
			frame.revalidate();
		}	
		
	} 	
	
	public static class NavigateToOverviewPanel implements ActionListener {
		
		AppFrame frame;
		OverviewPanel overviewPanel;
		
		public NavigateToOverviewPanel(AppFrame frame) {
			this.frame = frame;
		}
		
		@Override public void actionPerformed(ActionEvent arg0) {
			frame.setContentPane(overviewPanel);
			frame.revalidate();
		}	
		
	}
}
