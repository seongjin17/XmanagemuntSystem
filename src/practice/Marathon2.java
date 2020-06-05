
class Marathon2{
   
        private static String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        private static int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };
       
        public void Marathonprint() {
        	for (int i = 0; i < Marathon2.names.length; i++) {
        		System.out.println(Marathon2.names[i] + ": " + Marathon2.times[i]);
        	}
        }
        public static void main(String[] args) {
        	Marathon2 mar = new Marathon2();
        		mar.Marathonprint();
   		 
   	 }
}

	



