package app;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import net.miginfocom.swing.MigLayout;

public class EventListItem extends JPanel {
	
	
	
	public EventListItem(Event event){
		setLayout(new MigLayout("", "[286.00px]", "[73.00px]"));
		
		JPanel panel = new JPanel();
		add(panel, "flowx,cell 0 0,alignx left,aligny center");
		
		JLabel lblStartTime = new JLabel(event.getStartTime());
		add(lblStartTime, "cell 0 0,alignx left,aligny top");		
		
		JLabel lblCreator = new JLabel(event.getCreator());
		add(lblCreator, "cell 0 0,alignx left,aligny top");
		
		JLabel lblSubject = new JLabel(event.getSubject());
		add(lblSubject, "cell 0 0,alignx left,aligny top");
		
		JLabel lblEndTime = new JLabel(event.getEndTime());
		add(lblEndTime, "cell 0 0,alignx left,aligny top");
		
		JLabel lblDate = new JLabel(event.getDate());
		add(lblDate, "cell 0 0,alignx left,aligny top");
		
	}
}
