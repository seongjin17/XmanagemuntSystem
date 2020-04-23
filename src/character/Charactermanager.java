package character;
import java.util.ArrayList;
import java.util.Scanner;

public class Charactermanager {
	ArrayList<Character> characters = new ArrayList<Character>();
	Scanner input;
	Charactermanager(Scanner input){
		this.input = input;
	}	
	
	public void addcharacter() {	
		int kind=0;
		Character character;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4) { 
			System.out.print("1 for fotrhtransfer");
			System.out.print("2 for thirdtransfer");
			System.out.print("3 for secondtransfer");
			System.out.print("4 for firsttransfer");
			System.out.print("Select num for character Kind between 1-4:");
			kind = input.nextInt();
			if(kind==1) {
				character = new  Character(CharacterKind.forthtransfer);
				character.getUserInput(input);
				characters.add(character);
				break;
			}
			else if(kind==2) {
				character = new Character(CharacterKind.thirdtransfer);
				character.getUserInput(input);
				characters.add(character);
				break;
			}
			else if(kind==3) {
				character = new Character(CharacterKind.Secondtransfer);
				character.getUserInput(input);
				characters.add(character);
				break;
			}
			else if(kind==4) {
				character = new Character(CharacterKind.firsttransfer);	
				character.getUserInput(input);
				characters.add(character);
				break;
			}
			else {
				System.out.print("Select num for character Kind between 1-4:");
			}
			
		}	
			    
	}
	public void deletechatacter() {
		System.out.print("character nicname:");
	    String nicname= input.next();
	    int index=-1;
	    for(int i=0;i<characters.size();i++) {
	    	 if(characters.get(i).getNicname().equals(nicname)) {
	 	    	index = i;
	 	    	break;
	    	 }	
	    }
	    if(index >=0) {
	    	characters.remove(index);
	    	System.out.println("the character"+ nicname +"is deleted");
	    }
	    else {
	    	System.out.println("the character has not been registered");
	    	return;
	    }
	     	    
	}
	public void editcharacter() {
		System.out.print("character nicname:");
	    String nicname = input.next();
	    for(int i=0;i<characters.size();i++) {
	    	Character character = characters.get(i);
		    if(character.getNicname().equals(nicname)) {
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
						String characternicname = input.next();
						character.setNicname(nicname);
						
					}	
					else if(num == 2) {
						System.out.print("character level:");						
					    int level = input.nextInt();
					    character.setLevel(level);
					   
					}
					else if(num == 3) {
						System.out.print("character power:");
					    int power = input.nextInt();
					    character.setPower(power);
					       
					}
					else if(num == 4 ) {
						System.out.print("character job:");
					    String job = input.next();
					    character.setJob(job);
					   
					}
					else {
						continue;
					}
				}
				break;
		    }	
	    }
	}
	public void viewcharacters() {
//		System.out.print("character nicname:");
//	    String nicname = input.next();
		System.out.println("registered character :"+characters.size());
		for(int i=0;i<characters.size();i++) {
			characters.get(i).printinfo();
		}
	    
	}    
}

