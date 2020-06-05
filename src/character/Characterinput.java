package character;

import java.util.Scanner;

public interface Characterinput {
	public String getNicname();
	public void setNicname(String Nicname);
	public void setLevel(int level);
	public void setPower(int power);
	public void setJob(String job);
	public void getUserInput(Scanner input);
	public void printinfo();
	public void setCharacterNicname(Scanner input);
	public void setCharacterlevel( Scanner input);
	public void setCharacterpower(Scanner input);
	public void setCharacterjob(Scanner input);
}
