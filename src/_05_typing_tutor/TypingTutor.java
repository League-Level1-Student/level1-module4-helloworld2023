package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.isVisible();
		frame.setTitle("Type or Die");
		char currentLetter;
		currentLetter = generateRandomLetter();
		JLabel label = new JLabel();
	}
	
	static char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	
}
