import java.util.InputMismatchException;
import java.util.Scanner;

public class Plus {
	 public static void main(String[] args) {
		 
		 try {
			 System.out.print("a=");			 
			 int a = getNum();
			 System.out.print("b=");
			 int b = getNum();
			 System.out.print("a+b=");
			 System.out.print(a+b);
		 }
		 catch(InputMismatchException e){
			 System.out.print("Put an integer number"); 
			 
		 }
		  
	 }			
	public static int getNum() throws InputMismatchException{
		Scanner input = new Scanner(System.in);	
		int num = input.nextInt();
		return num;
		
	}
}
