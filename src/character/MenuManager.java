package character;
import java.util.Scanner;
public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Charactermanager charatermanager = new Charactermanager(input);
		int num = -1;
		
		while(num !=5) {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				charatermanager.addcharacter();
				break;
			case 2:
				charatermanager.deletechatacter();
				break;
			case 3:
				charatermanager.editcharacter();
				break;
			case 4:
				charatermanager.viewcharacters();
				break;
			default:
				continue;
			}
			
		}
	}		
	public static void showMenu(){
		System.out.println("***Character Management System Menu***");
		System.out.println("1, Add character");
		System.out.println("2, Delete character");
		System.out.println("3, Edit character");
		System.out.println("4, View characters");
		System.out.println("5, Exit");
		System.out.println("Select one number between 1-5:");
	}
}	
	
	