package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	JButton joke = new JButton();
	JButton pun = new JButton();
	
	static ChuckleClicker c = new ChuckleClicker();
	
	public static void main(String[] args) {
		c.makeButtons();
	}
	
	public void makeButtons(){
		JFrame frame = new JFrame();
		frame.isVisible();
		JPanel panel = new JPanel();
		joke.addActionListener(this);
		pun.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
	
}
