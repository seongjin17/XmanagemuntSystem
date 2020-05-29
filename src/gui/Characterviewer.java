package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Characterviewer extends JFrame {
	public Characterviewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Nicname");
		model.addColumn("level");
		model.addColumn("Power");
		model.addColumn("Job");
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);		 		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
