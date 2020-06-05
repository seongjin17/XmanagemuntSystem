
public class Information {
	
	public static void main(String[] args) {
		int Id= 2017011902;
		Myinformation("조성진");
		Myinformation(Id);
	}
	static void Myinformation(String name) {
		System.out.print("이름:");
		System.out.println(name);
	}
	static void Myinformation(int Id) {
		
		System.out.print("Id:");
		System.out.println(Id);
	}
}
