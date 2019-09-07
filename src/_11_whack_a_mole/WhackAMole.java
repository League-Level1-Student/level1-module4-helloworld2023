package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel;
	JButton mole;
	int hit = 0;
	int miss = 0;
	Date time = new Date();
	
	public static void main(String[] args) {
		
		WhackAMole wam = new WhackAMole();
		wam.setup();
		
	}
	
	public void setup() {
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500,250);
		Random r = new Random();
		int m = r.nextInt(25);
		for(int i=0; i<25; i++) {
			if(i==m) {
				mole = new JButton("mole!");
				panel.add(mole);
				mole.addActionListener(this);
			}
			else{
				JButton a = new JButton();
				panel.add(a);
				a.addActionListener(this);
			}
		}
		frame.validate();
		frame.repaint();
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mole) {
			speak("You hit the mole!");
			hit++;
		}
		else {
			miss++;
			switch (miss) {
			case 1:
				speak("You missed!");
				break;
			case 2:
				speak("Miss");
				break;
			case 3:
				speak("You missed!");
				break;
			case 4:
				speak("Miss!");
				break;
			default:
				speak("You missed!");
				break;
			}
			
		}
		if(hit==10) {
			endGame(time, hit);
			System.exit(0);
		}
		if(miss==5) {
			System.out.println("You have lost.");
			System.exit(0);
		}
		frame.remove(panel);
		setup();
	}
	
}
