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

	public static void main(String[] args) {
		
	}
	
	public void create() {
		JFrame frame = new JFrame();
		frame.isVisible();
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton trick = new JButton();
		panel.add(trick);
		trick.addActionListener(this);
		JButton treat = new JButton();
		panel.add(treat);
		treat.addActionListener(this);
		
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
	}

}
