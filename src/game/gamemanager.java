package game;

public class gamemanager {

	public static void main(String[] args) {
		Monster monster1=new Monster();
		Hunter hunter1= new Hunter();
		hunter1.attack(monster1);
		System.out.println("monster hp:"+monster1.hp);

	}

}
