import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Charactermanager charatermanager = new Charactermanager(input);
		int num = -1;
		
		while(num !=5) {
			System.out.println("Selet one number between 1-5:");
			System.out.println("1, Add character");
			System.out.println("2, Delete character");
			System.out.println("3, Edit character");
			System.out.println("4, View character");
			System.out.println("Exit");
			System.out.println("Select one number between 1-5:");
			num = input.nextInt();
			if(num == 1) {
				charatermanager.addcharacter();
			}	
			else if(num == 2) {
				charatermanager.deletechatacter();
			}
			else if(num == 3) {
				charatermanager.editcharacter();
			}
			else if(num == 4 ) {
				charatermanager.viewcharacter();
			}
			else {
				continue;
			}
		}
	}		
	
}	
	
	