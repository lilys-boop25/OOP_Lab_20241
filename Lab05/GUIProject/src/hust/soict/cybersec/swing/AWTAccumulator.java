package hust.soict.cybersec.swing;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame{
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0; // Accumulated sum init 0
	
	//Constructor to setup GUI components and event handlers
	public AWTAccumulator() {
		setLayout(new GridLayout(2, 2));
		
		add(new Label("Enter an Integer: "));
		
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		
		add(new Label("The Accumulated Sum is: "));
		
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		
		setTitle("AWT Accumulator");
		setSize(350, 120);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new AWTAccumulator();
	}
	
	private class TFInputListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int numerIn = Integer.parseInt(tfInput.getText());
			sum += numerIn;
			tfInput.setText("");
			tfOutput.setText(sum + "");
		}
	}
}