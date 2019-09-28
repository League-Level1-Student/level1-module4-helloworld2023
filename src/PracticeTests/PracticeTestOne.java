package PracticeTests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTestOne implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton a = new JButton();
	JButton b = new JButton();
	JTextField textfield = new JTextField(5);
	
	public static void main(String[] args) {
		
		PracticeTestOne pto = new PracticeTestOne();
		pto.setup();
		
	}
	
	public void setup(){
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		label.setText("What goes up but never comes down?");
		a.addActionListener(this);
		a.setText("Hint");
		b.addActionListener(this);
		b.setText("Submit");
		panel.add(a);
		panel.add(b);
		panel.add(textfield);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==(a)) {
			JOptionPane.showMessageDialog(null, "A quality that all human beings have.");
		}
		else if(e.getSource()==(b) && textfield.getText().equals("Age") || textfield.getText().equals("Your age")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect.");
		}
		
	}
	
}
