package character;
import java.util.ArrayList;
import java.util.Scanner;

public class Charactermanager {
	ArrayList<Characterinput> characters = new ArrayList<Characterinput>();
	Scanner input;
	Charactermanager(Scanner input){
		this.input = input;
	}	
	
	public void addcharacter() {	
		int kind=0;
		Characterinput characterinput;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4) { 
			System.out.print("1 for fotrhtransfer");
			System.out.print("2 for thirdtransfer");
			System.out.print("3 for secondtransfer");
			System.out.print("4 for firsttransfer");
			System.out.print("Select num for character Kind between 1-4:");
			kind = input.nextInt();
			if(kind==1) {
				characterinput = new forthtransfer(CharacterKind.forthtransfer);
				characterinput.getUserInput(input);
				characters.add(characterinput);
				break;
			}
			else if(kind==2) {
				characterinput = new thirdtransfer(CharacterKind.thirdtransfer);
				characterinput.getUserInput(input);
				characters.add(characterinput);
				break;
			}
			else if(kind==3) {
				characterinput = new secondtransfer(CharacterKind.Secondtransfer);
				characterinput.getUserInput(input);
				characters.add(characterinput);
				break;
			}
			else if(kind==4) {
				characterinput = new firsttransfer(CharacterKind.firsttransfer);	
				characterinput.getUserInput(input);
				characters.add(characterinput);
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
	    int index= findindex(nicname);
	    for(int i=0;i<characters.size();i++) {
	    	 if(characters.get(i).getNicname().equals(nicname)) {
	 	    	index = i;
	 	    	break;
	    	 }	
	    }
	    removefromCharacters(index,nicname);
	}
	public int findindex(String nicname) {
		int index=-1;
	    for(int i=0;i<characters.size();i++) {
	    	 if(characters.get(i).getNicname().equals(nicname)) {
	 	    	index = i;
	 	    	break;
	    	 }	
	    }
	    return index;
	}
	     	    
	
	public int removefromCharacters(int index, String nicname){
		 if(index >=0) {
		    	characters.remove(index);
		    	System.out.println("the character"+ nicname +"is deleted");
		    	return 1;
		    }
		    else {
		    	System.out.println("the character has not been registered");
		    	return-1;
		    }	
	}
	public void editcharacter() {
		System.out.print("character nicname:");
	    String nicname = input.next();
	    for(int i=0;i<characters.size();i++) {
	    	Characterinput character = characters.get(i);
		    if(character.getNicname().equals(nicname)) {
		    	int num = -1;
				while(num !=5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						character.setCharacterNicname(input);
						break;
					case 2:
						character.setCharacterlevel(input);
						break;
					case 3:
						character.setCharacterpower(input);
						break;
					case 4:
						character.setCharacterjob(input);
						break;
					default:
						continue;
					}
				}		
			break;
		    }	
	    }
	}
	public void viewcharacters() {

		System.out.println("registered character :"+characters.size());
		for(int i=0;i<characters.size();i++) {
			characters.get(i).printinfo();
		}
	    
	} 
	
	public void showEditMenu() {
		System.out.println("** Character Info Edit Menu **");
		System.out.println("1, Edit nicname");
		System.out.println("2, Edit level ");
		System.out.println("3, Edit power");
		System.out.println("4, Edit job");
		System.out.println("5, Exit");
		System.out.println("Select one number between 1-5:");
	}
}

