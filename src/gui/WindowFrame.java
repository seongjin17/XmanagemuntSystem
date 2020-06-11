package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import character.Charactermanager;

public class WindowFrame extends JFrame{
	
	Charactermanager charactermanager;
	MenuSelection menuselection ;	
	CharacterAdder characteradder ;
	CharacterViewer characterviewer ;
	
	
	public WindowFrame(Charactermanager charactermanager) {
		this.charactermanager = charactermanager;
		menuselection = new MenuSelection(this);
		characteradder = new CharacterAdder(this);
		characterviewer = new CharacterViewer(this,this.charactermanager);
		
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
