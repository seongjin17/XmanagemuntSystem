package plane;
import java.util.Scanner;
public class PlaneTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Planemanager planemanager = new Planemanager(input);
		int num = -1;
		while(num != 4) {
			System.out.println("***Plane Management System Menu***");
			System.out.println("1, Add plane");
			System.out.println("2, Delete plane");
			System.out.println("3, View plane");
			System.out.println("4, Exit");
			System.out.println("Select one number between 1-4:");
			num = input.nextInt();
			if(num == 1) {
				planemanager.addplane();
			}	
			else if(num == 2) {
				planemanager.deleteplane();
			}
			else if(num == 3 ) {
				planemanager.viewplanes();
			}
			else {
				continue;
			}
		}

	}
}