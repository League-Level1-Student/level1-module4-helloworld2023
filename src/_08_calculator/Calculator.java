package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	JButton a = new JButton();
	JButton s = new JButton();
	JButton m = new JButton();
	JButton d = new JButton();
	JTextField one = new JTextField(10);
	JTextField two = new JTextField(10);
	JLabel answer = new JLabel();
	
	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.setup();
		
	}
	
	public void setup() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setTitle("Simple Calculator");
		frame.add(one);
		frame.add(two);
		JPanel panel = new JPanel();
		panel.add(one);
		panel.add(two);
		panel.add(a);
		a.addActionListener(this);
		a.setText("Add");
		panel.add(s);
		s.addActionListener(this);
		s.setText("Sub");
		panel.add(m);
		m.addActionListener(this);
		m.setText("Mul");
		panel.add(d);
		d.addActionListener(this);
		d.setText("Div");
		panel.add(answer);
		frame.add(panel);
	}
	
	public int add(int add1, int add2) {
		return add1 + add2;
	}
	
	public int subtract(int sub1, int sub2) {
		return sub1 - sub2;
	}
	
	public int multiply(int mul1, int mul2) {
		return mul1 * mul2;
	}
	
	public int divide(int div1, int div2) {
		return div1 / div2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int o = Integer.parseInt(one.getText());
		int t = Integer.parseInt(two.getText());
		int z = 0;
		if(e.getSource()==a) {
			z = add(o,t);
		}
		else if(e.getSource()==s) {
			z = subtract(o, t);
		}
		else if(e.getSource()==m) {
			z = multiply(o, t);
		}
		else {
			z = divide(o, t);
		}
		answer.setText("" + z);
	}
}
