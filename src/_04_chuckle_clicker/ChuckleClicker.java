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
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(joke);
		panel.add(pun);
		joke.addActionListener(this);
		pun.addActionListener(this);
		joke.setText("Joke");
		pun.setText("Punchline");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == joke) {
			System.out.println("What kind of tea did the American Colonists want?");
		}
		if(arg0.getSource() == pun) {
			System.out.println("Liberty");
		}
	}
	
}
