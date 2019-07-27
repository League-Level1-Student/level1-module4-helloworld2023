package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{

	public static void main(String[] args) {
		
	}
	
	public void create() {
		JFrame frame = new JFrame();
		frame.isVisible();
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton trick = new JButton();
		frame.add(trick);
		trick.addActionListener(this);
		JButton treat = new JButton();
		frame.add(treat);
		treat.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}
