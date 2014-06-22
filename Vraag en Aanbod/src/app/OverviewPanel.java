package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class OverviewPanel extends JPanel {
	
	public OverviewPanel(){
		setLayout(new BorderLayout(0, 0));
		
		JPanel UpperPanel = new JPanel();
		UpperPanel.setBackground(Color.GRAY);
		add(UpperPanel, BorderLayout.NORTH);
		UpperPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel UpperLabel = new JLabel("  Vraag en Aanbod");
		UpperLabel.setHorizontalAlignment(SwingConstants.LEFT);
		UpperLabel.setForeground(Color.WHITE);
		UpperLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 32));
		UpperPanel.add(UpperLabel, BorderLayout.SOUTH);
		
		JPanel LowerPanel = new JPanel();
		LowerPanel.setBackground(Color.GRAY);
		add(LowerPanel, BorderLayout.SOUTH);
		
		JButton btnMaakNieuwEvent = new JButton("Press me!");
		add(btnMaakNieuwEvent, BorderLayout.WEST);
		btnMaakNieuwEvent.addActionListener(new AllActionListener.TextDisplayHandler());
	}
}
