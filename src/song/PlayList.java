package song;

public class PlayList {

	public static void main(String[] args) {
		 Music[] music = new Music[3]; 
		 music[0] = new Music("�����", "���"); 
		 music[1] = new Music("�", "�޽þ�"); 
		 music[2] = new Music("��ߵ�", "���"); 
			   
		 GenreMusic[] genreMusic = new GenreMusic[3]; 
		 genreMusic[0] = new GenreMusic("�����", "���", "�����"); 
		 genreMusic[1] = new GenreMusic("�", "�޽þ�", "�����丮��"); 
		 genreMusic[2] = new GenreMusic("��ߵ�", "���", "���ְ�"); 
		 for (int i = 0; i < music.length; i++) { 
		 music[i].printPlaylist();
		 genreMusic[i].printPlaylist(); 
		     		    
		 } 
	}

}
