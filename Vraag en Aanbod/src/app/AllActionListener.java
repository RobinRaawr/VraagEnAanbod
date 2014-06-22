package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllActionListener {

	public static class TextDisplayHandler implements ActionListener {
		@Override public void actionPerformed(ActionEvent arg0) {
			System.out.println("Er is op de knop gedrukt omg");
		}
	}

}
