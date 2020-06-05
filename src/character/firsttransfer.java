package character;

import java.util.Scanner;

public class firsttransfer extends Character {
	public firsttransfer(CharacterKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {		
		setCharacterNicname(input);
		setCharacterlevel(input);
		setCharacterpower(input);
		setCharacterjob(input);
	}
	public void printinfo() {
		String skind=getkind();
		System.out.println("nicname:"+ nicname+"transfer:"+skind +"level:"+level+"power:"+power+"job:"+job);
		
	}
	
}
