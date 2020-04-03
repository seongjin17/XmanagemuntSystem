import java.util.Scanner;

public class Charactermanager {
	Character  character;
	Scanner input;
	
	Charactermanager(Scanner input){
		this.input = input;
	}	
	
	public void addcharacter() {
		character = new Character();
		System.out.print("character nicname:");
		character.nicname = input.next();
	    System.out.print("character level:");
	    character.level = input.nextInt();
	    System.out.print("character power:");
	    character.power = input.nextInt();
	    System.out.print("character job:");
	    character.job = input.next();
	}
	public void deletechatacter() {
		System.out.print("character nicname:");
	    String characternicname = input.next();
	    if(character == null) {
	    	System.out.println("the character has not been registered");
	    	return;
	    }
	    if(character.nicname == characternicname) {
	    	character = null;
	    	System.out.println("the character is deleted");
	    }
	    
	}
	public void editcharacter() {
		System.out.print("character nicname:");
	    String characternicname = input.next();
	    if(character.nicname == characternicname) {
	    	System.out.println("the character to be edited is" + characternicname);
	    }
	}
	public void viewcharacter() {
		System.out.print("character nicname:");
	    String characternicname = input.next();
	    if(character.nicname == characternicname) {
	    	character.printinfo();
	    }
	}    
}

