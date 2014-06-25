package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class OverviewPanel extends JPanel {
	
	public OverviewPanel(Main.OverviewFrame frame){
		setLayout(new BorderLayout(0, 0));
		
		JPanel UpperPanel = new JPanel();
		UpperPanel.setBackground(Color.GRAY);
		add(UpperPanel, BorderLayout.NORTH);
		UpperPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel LowerPanel = new JPanel();
		LowerPanel.setBackground(Color.GRAY);
		add(LowerPanel, BorderLayout.SOUTH);
		
		JLabel lblHeader = new JLabel("  Vraag en Aanbod");
		lblHeader.setHorizontalAlignment(SwingConstants.LEFT);
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setFont(new Font("Segoe UI Light", Font.PLAIN, 32));
		UpperPanel.add(lblHeader, BorderLayout.SOUTH);		
		
		JPanel MiddlePanel = new JPanel();
		add(MiddlePanel, BorderLayout.CENTER);
		MiddlePanel.setLayout(new MigLayout("", "[436px]", "[233px]"));
		
		JButton btnMaakNieuwEvent = new JButton("Maak Nieuw Event");
		btnMaakNieuwEvent.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		btnMaakNieuwEvent.setForeground(Color.BLACK);
		MiddlePanel.add(btnMaakNieuwEvent, "cell 0 0,alignx trailing,aligny bottom");
		btnMaakNieuwEvent.addActionListener(new AllActionListeners.NavigateToNewEventHandler(frame));		
	}
}
