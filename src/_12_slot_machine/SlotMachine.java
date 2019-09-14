package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();
	JLabel one = new JLabel();
	JLabel two = new JLabel();
	JLabel three = new JLabel();
	int a = 0;
	int b = 0;
	int c = 0;
	
	public static void main(String[] args) {
		
		SlotMachine sm = new SlotMachine();
		sm.setup();
		
	}
	
	public void setup(){
		frame.setVisible(true);
		frame.add(panel);
		try {
			one = createLabelImage("rose.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			two = createLabelImage("violet.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			three = createLabelImage("orchid.jpeg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(one);
		panel.add(two);
		panel.add(three);
		spin.addActionListener(this);
		spin.setText("Spin");
		panel.add(spin);
		frame.pack();
	}
	
	public void reelSetup() {
		Random r = new Random();
		a = r.nextInt(3);
		b = r.nextInt(3);
		c = r.nextInt(3);
		//setup first reel
		if(a==0) {
			try {
				one = createLabelImage("rose.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(a==1) {
			try {
				one = createLabelImage("violet.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			try {
				one = createLabelImage("orchid.jpeg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//setup second reel
		if(b==0) {
			try {
				two = createLabelImage("rose.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(b==1) {
			try {
				two = createLabelImage("violet.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			try {
				two = createLabelImage("orchid.jpeg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(c==0) {
			try {
				three = createLabelImage("rose.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(c==1) {
			try {
				three = createLabelImage("violet.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			try {
				three = createLabelImage("orchid.jpeg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		panel.add(one);
		panel.add(two);
		panel.add(three);
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==spin) {
			frame.remove(panel);
			reelSetup();
			panel = new JPanel();
			panel.add(one);
			panel.add(two);
			panel.add(three);
			panel.add(spin);
			frame.add(panel);
			frame.pack();
			if(a == b && b == c) {
				JOptionPane.showMessageDialog(null, "You Won!");
				}
		}
	}
}
