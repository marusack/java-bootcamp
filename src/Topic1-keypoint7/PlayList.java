
import java.util.ArrayList;


public class PlayList {
	private ArrayList<Music> playlist;
	private String name;
	

	public PlayList(String name) {
		this.setName(name);
		this.setPlaylist(new ArrayList<Music>());
	}
	
	public Music search(int number){
		return this.getPlaylist().get(number);
	}
	public void playMusic(int number){
		this.search(number).play();
				
	}
	public void stopMusic(int number){
		this.search(number).stop();
				
	}
	public void pauseMusic(int number){
		this.search(number).pause();
	}
	public void nextMusic(int number){
		this.search(number).stop();
		this.search(number+1).play();
	}
	public void previousMusic(int number){
		this.search(number).stop();
		this.search(number-1).play();
	}
	
	public String toString(){
		String head="";
		String body="";
		head="PlayList Name: "+this.getName()+"\n"+"Musics : \n";
		for (int i = 0; i < this.getPlaylist().size(); i++) {
			body+=i+"-"+this.getPlaylist().get(i).toString();
		}
		return head+body;
	}
	public String addMusic(Music music) {
		try {
			this.getPlaylist().add(music);
			return" The Song "+music.getTitle() +" was added to "+this.getName()+" playlist";
			
		} catch (Exception e) {
			return" The Song was not added to"+this.getName()+" playlist";
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	

	/**
	 * @return the playlist
	 */
	public ArrayList<Music> getPlaylist() {
		return playlist;
	}

	/**
	 * @param playlist the playlist to set
	 */
	public void setPlaylist(ArrayList<Music> playlist) {
		this.playlist = playlist;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
