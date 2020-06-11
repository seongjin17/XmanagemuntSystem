package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import character.Characterinput;
import character.Charactermanager;

public class CharacterViewer extends JPanel {
	
	WindowFrame frame;
	Charactermanager charactermanager;
	public CharacterViewer(WindowFrame frame,Charactermanager charactermanager) {
		this.frame = frame;
		this.charactermanager = charactermanager;
		
		System.out.println("***"+ charactermanager.size() +"***");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Nicname");
		model.addColumn("level");
		model.addColumn("Power");
		model.addColumn("Job");
		
		for (int i= 0; i<charactermanager.size();i++) {
			Vector row = new Vector();
			Characterinput ci = charactermanager.get(i);
			row.add(ci.getNicname());
			row.add(ci.getLevel());
			row.add(ci.getPower());
			row.add(ci.getJob());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);		 		
		
	}

}
