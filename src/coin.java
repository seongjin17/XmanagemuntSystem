import java.util.Random;
import java.util.Scanner;

public class coin {
	static int rand() {
		int randomNum = (int)(Math.random() * 2);
		return randomNum;
	
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int coin = rand();
		System.out.println("H(0) or T(1):");
		int select =input.nextInt();
		System.out.println(select);
		
		if(select == coin) {
			System.out.println("정답 !");
		}
		else if(select != coin) {
			System.out.println("오답 !");
		}
	}
}
		