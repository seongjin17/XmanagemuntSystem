import java.util.Scanner;

public class Car {
	static String carname;
	static int year;
	static String maker;
	static double speed;
	static Scanner input;
	static double a;
	
	public Car(String carname, int year, String maker, double speed,double a) {
		this.carname= carname;
		this.year = year;
		this.maker = maker;
		this.speed = speed;
		this.a= a;
	}
	
	    
	 public void getyear(){
		 Scanner input = new Scanner(System.in); 
		 Car.year=input.nextInt();
		 
		
	 }
	    
	 public void getspeed(){
		 Scanner input = new Scanner(System.in); 
		 Car.speed=input.nextDouble();
		 
		 
	 }
	    
	 public void getmaker(){
		Scanner input = new Scanner(System.in); 
		Car.maker=input.next();
	   
	 }
	 public void printinfo() {
			System.out.println("���̸�:"+ carname+" " +"year"+year+" "+"maker"+maker+" "+"speed"+speed);
			
	 }
	 public void simul() {
		 double a = speed/5;
		 System.out.println("���ӵ�=" +a);
		 
			
	}
	 
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 Car car = new Car(carname, year, maker, speed,a);
		 System.out.print("���̸�:");
	     car.carname= input.next();
	     System.out.print("����:");
		 car.getyear();
		 System.out.print("����Ŀ:");
		 car.getmaker();
		 System.out.print("�ְ�ӵ�:");
		 car.getspeed();	
		 car.printinfo();
		 car.simul();
		 
	 }
	 
}	 