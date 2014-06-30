package app;

import javax.swing.JPanel;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class EventListItem extends JPanel {
	
	
	
	public EventListItem(Event event){
		setLayout(new MigLayout("", "[305.00px,grow]", "[21.00px][34.00][6.00][-1.00]"));
		
		JLabel lblSubject = new JLabel(event.getSubject());
		add(lblSubject, "flowx,cell 0 0,alignx left,aligny top");
		
		JLabel lblCreator = new JLabel(event.getCreator());
		lblCreator.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblCreator, "cell 0 0,growx,aligny top");
		
		JLabel lblStartTime = new JLabel(event.getStartTime());
		add(lblStartTime, "flowx,cell 0 1,alignx left,aligny top");		
		
		JLabel lblEndTime = new JLabel(event.getEndTime());
		add(lblEndTime, "cell 0 1,alignx left,aligny top");
		
		JLabel lblDate = new JLabel(event.getDate());
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDate, "cell 0 1,growx,aligny top");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		add(panel, "cell 0 2,grow");
		panel.setLayout(new BorderLayout(0, 0));
		
	}
}
