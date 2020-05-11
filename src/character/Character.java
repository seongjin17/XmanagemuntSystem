package character;

import java.util.Scanner;

public abstract class Character implements Characterinput {
	protected CharacterKind kind= CharacterKind.forthtransfer;
	protected String nicname;
	protected int level;
	protected int power;
	protected String job;

	public Character() {
		
	}
	public Character(CharacterKind kind) {
		this.kind = kind;
		
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
	public Character(CharacterKind kind,String nicname, int level, int power, String job) {
		this.kind = kind;
		this.nicname = nicname;
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
	
	public abstract void printinfo();
	
	public void setCharacterNicname(Scanner input) {
		System.out.print("character nicname:");
		String nicname1= input.next();
		this.setNicname(nicname1);
	}
	public void setCharacterlevel(Scanner input) {
		System.out.print("character level:");						
	    int level = input.nextInt();
	    this.setLevel(level);
	}
	public void setCharacterpower(Scanner input) {
		System.out.print("character power:");
	    int power = input.nextInt();
	    this.setPower(power);
	}
	public void setCharacterjob(Scanner input) {
		System.out.print("character job:");
	   String job = input.next();
	    this.setJob(job);
	}
	public String getkind() {
		String skind ="none";
		switch(this.kind) {
		case forthtransfer:
			skind = "4차";
			break;
		case thirdtransfer:
			skind = "3차";
			break;
		case Secondtransfer:
			skind = "2차";
			break;
		case firsttransfer:
			skind = "1차";
			break;
		default:
		}
		return skind;
	}
	
	
}