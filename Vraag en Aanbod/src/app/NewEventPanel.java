package app;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class NewEventPanel extends JPanel {
	
	Main.OverviewFrame frame;
	
	public NewEventPanel(){
		setLayout(new BorderLayout(0, 0));
		
		JPanel UpperPanel = new JPanel();
		UpperPanel.setBackground(Color.GRAY);
		add(UpperPanel, BorderLayout.NORTH);
		UpperPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblHeader = new JLabel("  Maak Nieuw Event");
		lblHeader.setHorizontalAlignment(SwingConstants.LEFT);
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setFont(new Font("Segoe UI Light", Font.PLAIN, 32));
		UpperPanel.add(lblHeader);
		
		JPanel LowerPanel = new JPanel();
		LowerPanel.setBackground(Color.GRAY);
		add(LowerPanel, BorderLayout.SOUTH);
		LowerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
	}

}
