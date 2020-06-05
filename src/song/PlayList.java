package song;

public class PlayList {

	public static void main(String[] args) {
		 Music[] music = new Music[3]; 
		 music[0] = new Music("베토멘", "운명"); 
		 music[1] = new Music("헨델", "메시아"); 
		 music[2] = new Music("비발디", "사계"); 
			   
		 GenreMusic[] genreMusic = new GenreMusic[3]; 
		 genreMusic[0] = new GenreMusic("베토멘", "운명", "교향곡"); 
		 genreMusic[1] = new GenreMusic("헨델", "메시아", "오라토리오"); 
		 genreMusic[2] = new GenreMusic("비발디", "사계", "협주곡"); 
		 for (int i = 0; i < music.length; i++) { 
		 music[i].printPlaylist();
		 genreMusic[i].printPlaylist(); 
		     		    
		 } 
	}

}
