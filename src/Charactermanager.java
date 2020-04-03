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
	    String nicname= input.next();
	    if(nicname.equals(null)) {
	    	System.out.println("the character has not been registered");
	    }
	    if(character.nicname.equals(nicname)) {
	    	character = null;
	    	System.out.println("the character is deleted");
	    }
	    
	}
	public void editcharacter() {
		System.out.print("character nicname:");
	    String nicname = input.next();
	    if(character.nicname.equals(nicname)) {
	    	int num = -1;
			while(num !=5) {
				System.out.println("** Character Info Edit Menu **");
				System.out.println("1, Edit nicname");
				System.out.println("2, Edit level ");
				System.out.println("3, Edit power");
				System.out.println("4, Edit job");
				System.out.println("5, Exit");
				System.out.println("Select one number between 1-5:");
				num = input.nextInt();
				if(num == 1) {
					System.out.print("character nicname:");
					character.nicname = input.next();
					
				}	
				else if(num == 2) {
					System.out.print("character level:");
				    character.level = input.nextInt();
				   
				}
				else if(num == 3) {
					character.level = input.nextInt();
				    System.out.print("character power:");
				    
				}
				else if(num == 4 ) {
					character.power = input.nextInt();
				    System.out.print("character job:");
				   
				}
				else {
					continue;
				}
			}	
	    	
	    }
	}
	public void viewcharacter() {
		System.out.print("character nicname:");
	    String nicname = input.next();
	    if(character.nicname.equals(nicname)) {
	    	character.printinfo();
	    	
	    }
	}    
}

