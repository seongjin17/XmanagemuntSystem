import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class Componet {

	public static void main(String[] args) {
		JFrame frame = new JFrame("MyFrame");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();		
		JLabel label1 = new JLabel("Welcome to Java pizza. Choose the type of pizza.");
		JLabel label2 = new JLabel("count");
		JTextField field1= new JTextField(3);
		JButton button1 = new JButton("Combination");
		JButton button2 = new JButton("Potato");
		JButton button3 = new JButton("Roasted meat");
		
		panel1.add(label1);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(label2);
		panel2.add(field1);
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.setSize(800, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
