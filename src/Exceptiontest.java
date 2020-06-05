import java.util.Scanner;

public class Exceptiontest {

	public static void main(String[] args) {
		try {
			int num = getNum();
		}
		catch(MyException e) {
			 System.out.print("Error, the number is odd!");
		}
	}


	public static int getNum() throws MyException{
		Scanner input = new Scanner(System.in);	
		int num = input.nextInt();
		if(num%2!=0) {
			throw new MyException();
		}
		return num;
	}
}


