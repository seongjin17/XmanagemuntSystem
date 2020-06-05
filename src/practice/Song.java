
import java.util.HashSet;

public class Song {
		public static void main(String[] args) {
			HashSet<String> set = new HashSet<String>(); 
			for(int i=0;i<args.length;i++) {
				set.add(args[i]);
			}
			System.out.print("집합의 갯수는?");
			System.out.println(args.length);
			System.out.print("단어의 갯수는?");
			System.out.println(set.size());		
		}
			
		

}
