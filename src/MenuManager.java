import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while(num !=6) {
			System.out.println("Selet one number between 1-5:");
			System.out.println("1, Add character");
			System.out.println("2, Delete character");
			System.out.println("3, Edit character");
			System.out.println("4, View character");
			System.out.println("5, show a menu");
			System.out.println("Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			if(num ==1) {
				addcharacter();
			}	
			else if(num==2) {
				deletechatacter();
			}
			else if(num==3) {
				editcharacter();
			}
			else if(num==4) {
				viewcharacter();
			}
			else {
				continue;
			}
		}
	}		
	public static void addcharacter() {
		Scanner input = new Scanner(System.in);
		System.out.print("character name:");
	    String charactername = input.next();
	    System.out.print("character level:");
	    int characterlevel = input.nextInt();
	    System.out.print("character power:");
	    int characterpower = input.nextInt();
	    System.out.print("character job:");
	    String characterjob = input.next();
	}
	public static void deletechatacter() {
		Scanner input = new Scanner(System.in);
		System.out.print("character name:");
	    String charactername = input.next();
	}
	public static void editcharacter() {
		Scanner input = new Scanner(System.in);
		System.out.print("character name:");
	    String charactername = input.next();
	}
	public static void viewcharacter() {
		Scanner input = new Scanner(System.in);
		System.out.print("character name:");
	    String charactername = input.next();
    }
}	
	
	