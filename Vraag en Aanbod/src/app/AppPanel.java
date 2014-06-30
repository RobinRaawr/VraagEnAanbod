package app;

import javax.swing.JPanel;

public abstract class AppPanel extends JPanel {
	
	AppFrame frame;
	
	public AppPanel(AppFrame frame){
		this.frame = frame;
	}
	
	public abstract void refresh();

}
