
public class Character {
	String nicname;
	int level;
	int power;
	String job;

	public Character() {
		
	}
	public Character(String nicname, int level) {
		this.nicname= nicname;
		this.level = level;
		
	}
	public Character(String nicname, int level, int power, String job) {
		this.nicname= nicname;
		this.level = level;
		this.power = power;
		this.job = job;
	}
	public void printinfo() {
		System.out.println("nicname:"+ nicname +"level"+level+"power"+power+"job"+job);
		
	}
}