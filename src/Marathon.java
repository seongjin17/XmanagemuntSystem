
public class Marathon {

	public static void main(String[] args) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
            };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
            };
        
        int[] rank = new int[names.length];
        
		
        
        for(int i = 0 ; i <names.length ; i++){
        	   rank[i]=1;
        	   for(int j = 0 ; j < names.length ; j++){
        	    if(times[i] < times[j])
        	     rank[i] = rank[i] + 1;
        	   }
       }
        for(int i = 0 ; i <names.length ; i++){
        	if(rank[i]==2) {
        		System.out.println("second fastest"+names[i]+"½Ã°£"+times[i]);
        	}
        }
       
            

	}

}
