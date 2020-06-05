package song;


public class Music {
	String name;
	String song;
	public Music(String name, String song) {
		this.name = name;
		this.song = song;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public void printPlaylist() { 
		  System.out.printf("%s¿« %s\n", name, song); 
	} 
}
	

