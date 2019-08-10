package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {

	JFrame frame = new JFrame();
	char currentLetter;
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		
	TypingTutor tt = new TypingTutor();
	tt.setup();
		
	}
	
	static char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	
	public void setup() {
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(label.CENTER);
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you typed:" + currentLetter);
		if(e.getKeyChar() == (currentLetter)) {
			System.out.println("Correct.");
			panel.setBackground(Color.green);
		}
		else {
			panel.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		frame.pack();
	}
	
}
