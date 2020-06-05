package plane;
import java.util.Scanner;
public class Plane {
	private String producer;
	private String model;
	private int passengers;
	public Plane(){
	}
	public Plane(String producer){
		this.producer = producer;
		
	}
	public Plane(String producer, String model){
		this.producer = producer;
		this.model = model;
		
	}
	public Plane(String producer,String model,int passengers){
		this.producer = producer;
		this.model = model;
		this.passengers = passengers;
		
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	public void printinfo() {
		System.out.println("producer: "+ producer+" model: "+model +" passenger: "+passengers);
		
	}
	public void getUserInput(Scanner input) {		
		System.out.print("plane producer");
		String  producer = input.next();
		this.setProducer(producer);
		
	    System.out.print("plane model:");
	    String model = input.next();
	    this.setModel(model);
	    
	    System.out.print("plane passengers:");
	    int passengers = input.nextInt();
	    this.setPassengers(passengers);
	    
	   
	}	
	
}



