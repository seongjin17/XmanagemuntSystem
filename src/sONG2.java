import java.util.HashSet;
import java.util.Scanner;

public class sONG2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			HashSet<String> set = new HashSet<String>(); 
			String input = sc.nextLine().trim();
			String[] word = input.split(" ");
			int result = 0;
			for(int i=0;i<word.length;i++){
	            
				if(word[i].length() == 0) result++;
			}
			System.out.println(word.length - result);

	    }

	}
	
