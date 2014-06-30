package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

import javax.swing.JScrollPane;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JList;
public class OverviewPanel extends JPanel {
	
	
	public OverviewPanel(AppFrame frame){
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
		MiddlePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel MiddleOnderPanel = new JPanel();
		MiddlePanel.add(MiddleOnderPanel);
		MiddleOnderPanel.setLayout(new BorderLayout(0, 0));		
		
		JScrollPane overviewPane = new JScrollPane();
		MiddleOnderPanel.add(overviewPane, BorderLayout.CENTER);
				
		JPanel MiddleBovenPanel = new JPanel();
		MiddlePanel.add(MiddleBovenPanel, BorderLayout.NORTH);
		
		JButton btnMaakNieuwEvent = new JButton("Maak Nieuw Event");
		MiddleBovenPanel.add(btnMaakNieuwEvent);
		btnMaakNieuwEvent.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		btnMaakNieuwEvent.setForeground(Color.BLACK);
		btnMaakNieuwEvent.addActionListener(new AllActionListeners.NavigateToNewEventHandler(frame));		
	}
}
