package _08_calculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements KeyListener {
	
	JButton a = new JButton();
	JButton s = new JButton();
	JButton m = new JButton();
	JButton d = new JButton();
	JTextField one = new JTextField();
	JTextField two = new JTextField();
	
	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.setup();
		c.add();
		c.subtract();
		c.multiply();
		c.divide();
		
	}
	
	public void setup() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 200);
		frame.setTitle("Simple Calculator");
		frame.addKeyListener(this);
		frame.add(one);
		frame.add(two);
		JPanel panel = new JPanel();
		panel.add(a);
		panel.add(s);
		panel.add(m);
		panel.add(d);
		frame.add(panel);
	}
	
	public void add() {
		a.setText("Add");
	}
	
	public void subtract() {
		s.setText("Subtract");
	}
	
	public void multiply() {
		m.setText("Multiply");
	}
	
	public void divide() {
		d.setText("Divide");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
