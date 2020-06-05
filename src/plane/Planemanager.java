package plane;

import java.util.ArrayList;
import java.util.Scanner;
public class Planemanager {
	ArrayList<Plane> planes = new ArrayList<Plane>();
	Scanner input;
	Planemanager(Scanner input){
		this.input = input;
	}	
	
	public void addplane(){	
		
		Plane plane = new Plane();
		plane.getUserInput(input);
		planes.add(plane);
		
	
				
	}		
	public void deleteplane() {
		System.out.print("plane producer");
	    String producer= input.next();
	    int index=-1;
	    for(int i=0;i<planes.size();i++) {
	    	 if(planes.get(i).getProducer().equals(producer)) {
	 	    	index = i;
	 	    	break;
	    	 }	
	    }
	    if(index >=0) {
	    	planes.remove(index);
	    	System.out.println("producer "+ producer +" is deleted");
	    }
	    else {
	    	System.out.println("the character has not been registered");
	    	return;
	    }
	     	    
	}
	
	public void viewplanes() {
		System.out.println("registered planes :"+planes.size());
		for(int i=0;i<planes.size();i++) {
			planes.get(i).printinfo();
		}
	    
	}    
}

