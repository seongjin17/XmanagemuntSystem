import java.util.Scanner;

public class oper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1,num2,result;
		
		String oper;
		System.out.print("num1");
		num1 = input.nextInt();
		System.out.print("oper");
		oper = input.next();
		System.out.print("num2");
		num2 = input.nextInt();
		
		switch(oper) {
		case"+":
			result=num1+num2;
			System.out.print(num1+"+"+ num2+"=" +result );	
			break;
		case"-":
			result=num1-num2;
			System.out.print(num1+"-"+ num2+"=" +result );	
			break;
		case"*":
			result=num1*num2;
			System.out.print(num1+"*"+ num2+"=" +result );
			break;
		case"/":
			result=num1/num2;
			System.out.print(num1+"/"+ num2+"=" +result );	
			break;
		}
		
    }
}