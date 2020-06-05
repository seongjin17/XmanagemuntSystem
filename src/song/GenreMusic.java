package song;

public class GenreMusic extends Music {
	private String genre; 
	  public GenreMusic(String name, String song, String genre) { 
	    super(name, song); 
	    this.genre = genre; 
	 } 
	 
	 public void printPlaylist() { 
	   
	   System.out.printf("%s¿« %s (%s)\n", name, song, genre); 
	} 
	 

}
