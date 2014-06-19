package app;

import javax.swing.JPanel;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Overviewpanel extends JPanel {
	
	public Overviewpanel(){
		setLayout(new BorderLayout(0, 0));
		
		JPanel UpperPanel = new JPanel();
		UpperPanel.setBackground(Color.GRAY);
		add(UpperPanel, BorderLayout.NORTH);
		UpperPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel UpperLabel = new JLabel("  Vraag en Aanbod");
		UpperLabel.setForeground(Color.WHITE);
		UpperLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 32));
		UpperPanel.add(UpperLabel, BorderLayout.SOUTH);
		
		JPanel LowerPanel = new JPanel();
		LowerPanel.setBackground(Color.GRAY);
		add(LowerPanel, BorderLayout.SOUTH);
	}
}
