package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CharacterAdder extends JPanel{
	
	WindowFrame frame;
	
	public CharacterAdder(WindowFrame frame) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNicname = new JLabel("Nicname:",JLabel.TRAILING);
		JTextField fieldNicname = new JTextField(10);
		labelNicname.setLabelFor(fieldNicname);
		panel.add(labelNicname);
		panel.add(fieldNicname);
		
		JLabel labelLevel = new JLabel("Level:",JLabel.TRAILING);
		JTextField fieldLevel = new JTextField(10);
		labelLevel.setLabelFor(fieldLevel);
		panel.add(labelLevel);
		panel.add(fieldLevel);
		
		JLabel labelPower = new JLabel("Power:",JLabel.TRAILING);
		JTextField fieldPower = new JTextField(10);
		labelPower.setLabelFor(fieldPower);
		panel.add(labelPower);
		panel.add(fieldPower);
		
		JLabel labelJob = new JLabel("Job:",JLabel.TRAILING);
		JTextField fieldJob = new JTextField(10);
		labelJob.setLabelFor(fieldJob);
		panel.add(labelJob);
		panel.add(fieldJob);
		
		panel.add(new JButton("Add chracter"));
		panel.add(new JButton("back"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
