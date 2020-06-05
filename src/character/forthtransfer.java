package character;

import java.util.Scanner;

public class forthtransfer extends Character {
	public forthtransfer(CharacterKind kind) {
		super(kind);
	}
	
	
	
	public void getUserInput(Scanner input) {		
		setCharacterNicname(input);
		setCharacterlevel(input);
		setCharacterpower(input);  
		setCharacterjobWithYN(input);
	}
	public void setCharacterjobWithYN(Scanner input) {
		char answer='x';
	    while(answer !='y' && answer !='Y' && answer !='N' && answer !='n') {
	    	System.out.print("Are you free jab?(Y/N)");
		    answer = input.next().charAt(0);
		    if(answer =='y' || answer=='Y') {
		    	System.out.print("second job:");
		    	String sjob = input.next();
		    	this.setJob(sjob);	 
		    	break;
		    }
		    else if(answer =='n' || answer=='N'){
		    	System.out.print("first job:");
		    	String fjob = input.next();
		    	this.setJob(fjob);
		    	break;
		    }
		    else {
		    	
		    }
	    } 
	}
	public void printinfo() {
		String skind=getkind();
		System.out.println("nicname:"+ nicname+"transfer:"+skind +"level:"+level+"power:"+power+"job:"+job);
		
	}
	
	
}
