package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;


public class OverviewPanel extends AppPanel {			
	
	private JScrollPane scrollPane;
	private JPanel internalListPanel;

	public OverviewPanel(AppFrame frame){
		super(frame);
		
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
		
		JPanel MiddleBovenPanel = new JPanel();
		MiddlePanel.add(MiddleBovenPanel, BorderLayout.SOUTH);
		MiddleBovenPanel.setLayout(new MigLayout("", "[123px,grow]", "[25px]"));
		
		JButton btnMaakNieuwEvent = new JButton("Maak Nieuw Event");
		btnMaakNieuwEvent.setHorizontalAlignment(SwingConstants.RIGHT);
		MiddleBovenPanel.add(btnMaakNieuwEvent, "cell 0 0,alignx right,aligny top");
		btnMaakNieuwEvent.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		btnMaakNieuwEvent.setForeground(Color.BLACK);
		btnMaakNieuwEvent.addActionListener(new AllActionListeners.NavigateToNewEventHandler(frame));		
		
		JPanel MiddleOnderPanel = new JPanel();
		MiddlePanel.add(MiddleOnderPanel);
		MiddleOnderPanel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		MiddleOnderPanel.add(scrollPane, BorderLayout.CENTER);
		
		internalListPanel = new JPanel();
		scrollPane.setViewportView(internalListPanel);
		internalListPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		refresh();
		//revalidate();
	}

	@Override
	public void refresh() { // Hier hoeft geen appframe frame want die zit al in.. appPanel erft al over
		internalListPanel.removeAll(); // Gooi de interne lijst van de JScrollPane leeg.
		
		System.out.println("OverviewPanel >> refresh()");
		
		for (Event event : frame.getFakeDatabase().getAllEvents()){
			internalListPanel.add(new EventListItem(event));
		}
		
	}
}
