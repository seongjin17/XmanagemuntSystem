package character;

import java.util.Scanner;

public class Character {
	protected CharacterKind kind= CharacterKind.forthtransfer;
	protected String nicname;
	protected int level;
	protected int power;
	protected String job;

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
	public CharacterKind getKind() {
		return kind;
	}
	public void setKind(CharacterKind kind) {
		this.kind = kind;
	}
	public String getNicname() {
		return nicname;
	}
	public void setNicname(String nicname) {
		this.nicname = nicname;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public void printinfo() {
		System.out.println("nicname:"+ nicname +"level:"+level+"power:"+power+"job:"+job);
		
	}
	public void getUserInput(Scanner input) {		
		System.out.print("character nicname:");
		String nicname = input.next();
		this.setNicname(nicname);
		
	    System.out.print("character level:");
	    int level = input.nextInt();
	    this.setLevel(level);
	    
	    System.out.print("character power:");
	    int power = input.nextInt();
	    this.setPower(power);
	    
	    System.out.print("character job:");
	    String job = input.next();
	    this.setJob(job);
	}	
	
}