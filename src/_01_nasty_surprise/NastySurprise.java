package _01_nasty_surprise;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{

	JButton trick = new JButton();
	JButton treat = new JButton();
	
	public static void main(String[] args) {
		
		NastySurprise ns = new NastySurprise();
		ns.create();
		
	}
	
	public void create() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(trick);
		trick.addActionListener(this);
		trick.setText("Trick");
		panel.add(treat);
		treat.addActionListener(this);
		treat.setText("Treat");
		frame.pack();
	}

	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(trick)) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/39/6f/14/396f14bd9c68652906500047d677356c.jpg");
		}
		if(e.getSource().equals(treat)) {
			showPictureFromTheInternet("https://upload.wikimedia.org/wikipedia/en/3/34/InsidiousTheLastKey.jpg");
		}
	}

}
