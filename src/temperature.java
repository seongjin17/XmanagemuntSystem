import java.util.Scanner;

public class temperature {
	public static void main(String[] args) {
	  System.out.println("�����µ�=");		
	  Scanner input = new Scanner (System.in);
	  int f = input.nextInt (); 
      double c;
      c = 5.0/9*(f-32);
      System.out.println("ȭ�� �µ�=" +c);	
   } 
}
