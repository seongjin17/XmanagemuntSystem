package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	MenuSelection menuselection ;	
	CharacterAdder characteradder ;
	CharacterViewer characterviewer ;
	
	public WindowFrame() {
		this. menuselection = new MenuSelection(this);
		this. characteradder = new CharacterAdder(this);
		this. characterviewer = new CharacterViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
		this.setupPanel(menuselection); 
		
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel){
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public CharacterAdder getCharacteradder() {
		return characteradder;
	}
	public void setCharacteradder(CharacterAdder characteradder) {
		this.characteradder = characteradder;
	}
	public CharacterViewer getCharacterviewer() {
		return characterviewer;
	}
	public void setCharacterviewer(CharacterViewer characterviewer) {
		this.characterviewer = characterviewer;
	}
	
}
