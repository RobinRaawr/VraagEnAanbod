package app;

import javax.swing.JPanel;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;

public class EventListItem extends JPanel {	
	
	
	public EventListItem(Event event){
		setLayout(new MigLayout("", "[298.00px]", "[21.00px][34.00][6.00][-1.00]"));
		
		JLabel lblSubject = new JLabel(event.getSubject());
		lblSubject.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		add(lblSubject, "flowx,cell 0 0,alignx left,aligny top");
		
		JLabel lblCreator = new JLabel(event.getCreator());
		lblCreator.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblCreator.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblCreator, "cell 0 0,growx,aligny top");
		
		JLabel lblStartTime = new JLabel(event.getStartTime());
		lblStartTime.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		add(lblStartTime, "flowx,cell 0 1,alignx left,aligny top");
		
		JLabel label = new JLabel("-");
		add(label, "cell 0 1,aligny top");
		
		JLabel lblEndTime = new JLabel(event.getEndTime());
		lblEndTime.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		add(lblEndTime, "cell 0 1,alignx left,aligny top");
		
		JLabel lblDate = new JLabel(event.getDate());
		lblDate.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDate, "cell 0 1,alignx left,aligny top");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		add(panel, "cell 0 2,grow");
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblVraanbod = new JLabel(event.getVraanbod());
		lblVraanbod.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVraanbod.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		add(lblVraanbod, "cell 0 1,growx,aligny top");
		
	}
}
