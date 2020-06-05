package game;

public class Monster extends Hunter {
	public int hp= 900;
	public void attack(Monster target) {
		target.hp -=100;
	}
}
