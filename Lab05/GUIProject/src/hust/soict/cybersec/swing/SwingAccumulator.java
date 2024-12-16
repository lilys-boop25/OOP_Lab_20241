package hust.soict.cybersec.swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingAccumulator extends JFrame{
	private JTextField tfInput;
	private JTextField tfOutput;
	private int sum = 0;    // Accumulated sum init 0
	
	//Constructor to setup GUI components and event handlers
	public SwingAccumulator() {
		// TODO Auto-generated constructor stub
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2, 2));
		
		cp.add(new JLabel("Enter an Integer: "));
		
		tfInput = new JTextField(10);
		add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		
		add(new JLabel("The Accumulated Sum is: "));
		
		tfOutput = new JTextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		
		setTitle("Swing Accumulator");
		setSize(350, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingAccumulator();
	}
	public class TFInputListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			int numerIn = Integer.parseInt(tfInput.getText());
			sum += numerIn;
			tfInput.setText("");
			tfOutput.setText(sum + "");
		}

	}
}
