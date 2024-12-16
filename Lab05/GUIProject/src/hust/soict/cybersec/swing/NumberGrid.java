package hust.soict.cybersec.swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGrid extends JFrame{
	private JButton[] btnNumbers = new JButton[10];
	private JButton btnDelete, btnReset;
	private JTextField tfDisplay;

	public NumberGrid() {
		// TODO Auto-generated constructor stub
//		Initialize tfDisplay
		tfDisplay = new JTextField();
		tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
//		Create a Panel for Buttons
		JPanel panelButtons = new JPanel(new GridLayout(4, 3));
		addButtons(panelButtons);
//		Add Components to the Frame
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(tfDisplay, BorderLayout.NORTH);
		cp.add(panelButtons, BorderLayout.CENTER);
//		Configure the Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Number Grid");
		setSize(200, 200);
		setVisible(true);
	}
	void addButtons(JPanel panelButtons) {
	    ButtonListener btnListener = new ButtonListener();
//	    Add buttons 1 to 9
	    for (int i = 1; i <= 9; i++) {
	        btnNumbers[i] = new JButton("" + i);
	        panelButtons.add(btnNumbers[i]);
	        btnNumbers[i].addActionListener(btnListener);
	    }
//	    Add Delete Button
	    btnDelete = new JButton("DEL");
	    panelButtons.add(btnDelete);
	    btnDelete.addActionListener(btnListener);
//	    Add 0 button
	    btnNumbers[0] = new JButton("0");
	    panelButtons.add(btnNumbers[0]);
	    btnNumbers[0].addActionListener(btnListener);
//	    Add Reset Button
	    btnReset = new JButton("C");
	    panelButtons.add(btnReset);
	    btnReset.addActionListener(btnListener);
	}
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String button = e.getActionCommand();
			if(button.charAt(0) >= '0' && button.charAt(0) <= '9') {
				tfDisplay.setText(tfDisplay.getText() + button);
			} else if(button.equals("DEL")) {
				// Handle the "DEL" case
			} else {
				// Handle the "C" case
			}
		}
		
	}
}
