package game;

public class Hunter {
	public int hp = 500;
	public int atpower= 100;
	public void attack(Hunter target) {
		target.hp -=100;
	}

}
