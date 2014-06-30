package app;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class EventListItem extends JPanel {
	
	
	
	public EventListItem(Event event){
		
		
		JLabel lblCreator = new JLabel(event.getCreator());
		add(lblCreator);
		
		JLabel lblSubject = new JLabel(event.getSubject());
		add(lblSubject);
		
		JLabel lblStartTime = new JLabel(event.getStartTime());
		add(lblStartTime);
		
		JLabel lblEndTime = new JLabel(event.getEndTime());
		add(lblEndTime);
		
		JLabel lblDate = new JLabel(event.getDate());
		add(lblDate);
		
	}
}
