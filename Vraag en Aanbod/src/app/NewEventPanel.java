package app;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

public class NewEventPanel extends AppPanel {
	private JTextField txtSubject;
	private JTextField txtCreator;
	private JTextField txtStartTime;
	private JTextField txtEndTime;
	private JTextField txtDate;

	public NewEventPanel(AppFrame frame) {
		super(frame);

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

		JPanel MiddlePanel = new JPanel();
		add(MiddlePanel, BorderLayout.CENTER);
		MiddlePanel.setLayout(new MigLayout("",
				"[23.00][70.00][118.00,right][70.00]",
				"[][][24.00][24.00][24.00][24.00][24.00][][][]"));

		JLabel lblSubject = new JLabel("Vak");
		lblSubject.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		MiddlePanel.add(lblSubject, "cell 1 2,alignx left");

		txtSubject = new JTextField();
		txtSubject.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		MiddlePanel.add(txtSubject, "cell 2 2,growx");
		txtSubject.setColumns(10);

		JLabel lblSubjectExample = new JLabel("\"Wiskunde B\"");
		lblSubjectExample.setFont(new Font("Segoe UI Light", Font.ITALIC, 11));
		MiddlePanel.add(lblSubjectExample, "cell 3 2,alignx right");

		JLabel lblCreator = new JLabel("Creator");
		lblCreator.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		MiddlePanel.add(lblCreator, "cell 1 3,alignx left");

		txtCreator = new JTextField();
		txtCreator.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		MiddlePanel.add(txtCreator, "cell 2 3,growx");
		txtCreator.setColumns(10);

		JLabel lblCreatorExample = new JLabel("\"Gebruikersnaam\"");
		lblCreatorExample.setFont(new Font("Segoe UI Light", Font.ITALIC, 12));
		MiddlePanel.add(lblCreatorExample, "cell 3 3");

		JLabel lblStartTime = new JLabel("Start tijd");
		lblStartTime.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		MiddlePanel.add(lblStartTime, "cell 1 4,alignx left");

		txtStartTime = new JTextField();
		txtStartTime.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		MiddlePanel.add(txtStartTime, "cell 2 4,growx");
		txtStartTime.setColumns(10);

		JLabel label = new JLabel("\"12:00\"");
		label.setFont(new Font("Segoe UI Light", Font.ITALIC, 12));
		MiddlePanel.add(label, "cell 3 4,alignx right");

		JLabel lblEndTime = new JLabel("Eind tijd");
		lblEndTime.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		MiddlePanel.add(lblEndTime, "cell 1 5,alignx left");

		txtEndTime = new JTextField();
		txtEndTime.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		MiddlePanel.add(txtEndTime, "cell 2 5,growx");
		txtEndTime.setColumns(10);

		JLabel label_1 = new JLabel("\"13:00\"");
		label_1.setFont(new Font("Segoe UI Light", Font.ITALIC, 12));
		MiddlePanel.add(label_1, "cell 3 5,alignx right");

		JLabel lblDate = new JLabel("Datum");
		lblDate.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		MiddlePanel.add(lblDate, "cell 1 6,alignx left");

		txtDate = new JTextField();
		txtDate.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		MiddlePanel.add(txtDate, "cell 2 6,growx");
		txtDate.setColumns(10);

		JLabel label_2 = new JLabel("\"01-08-2014\"");
		label_2.setFont(new Font("Segoe UI Light", Font.ITALIC, 12));
		MiddlePanel.add(label_2, "cell 3 6,alignx right");

		JButton btnTerug = new JButton("Terug");
		btnTerug.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		MiddlePanel.add(btnTerug, "cell 1 9");
		btnTerug.addActionListener(new AllActionListeners.NavigateToOverviewPanel(frame));

		JButton btnMaakEvent = new JButton("Maak Event!");
		btnMaakEvent.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		MiddlePanel.add(btnMaakEvent, "cell 3 9,growx");
		btnMaakEvent.addActionListener(new NewEventPanel.AddNewEvent(frame));
		
		//TODO MAYBE DELETE KNOP MAYBE NAH
	}

	@Override
	public void refresh() {
		System.out.println("NewEventPanel >> refresh()");
		
		txtSubject.setText("");
		txtCreator.setText("");
		txtStartTime.setText("");
		txtEndTime.setText("");
		txtDate.setText("");
	}

	/*
	 * Dit is een (non-static) nested class, soms ook wel inner class genoemd.
	 * Een inner class kan altijd bij alle private's van de class waar deze in
	 * zit (de outer class).
	 */
	public class AddNewEvent implements ActionListener {

		AppFrame frame;

		public AddNewEvent(AppFrame frame) {
			this.frame = frame;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {

			String subject 		= txtSubject.getText();
			String creator 		= txtCreator.getText();
			String startTime 	= txtStartTime.getText();
			String endTime 		= txtEndTime.getText();
			String date 		= txtDate.getText();

			frame.getFakeDatabase().insertEvent(creator, subject, startTime, endTime, date);
			
			refresh();
			frame.revalidate();
		}

	}
}
