package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CharacterViewer extends JPanel {
	
	WindowFrame frame;
	
	public CharacterViewer(WindowFrame frame) {
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Nicname");
		model.addColumn("level");
		model.addColumn("Power");
		model.addColumn("Job");
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);		 		
		
	}

}
