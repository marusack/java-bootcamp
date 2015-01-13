
public class Music {
	private String title;
	private int duration;
	private String artist;
	private boolean state;
	public Music(String title, int duration, String artist) {
		
		this.setTitle(title);
		this.setDuration(duration);
		this.setArtist(artist);
		this.setState(false);// indicates that the music is on or off
	}
	
	//the methods below are for state changing
	
	
	public void play(){
		this.setState(true);
	}
	public void pause(){
		this.setState(false);
		
	}
	public void stop(){
		this.setState(false);
	}
	
	public String toString(){
		return  " Name: "+this.getTitle()+",Duration: "+this.getDuration()+" Artist"+this.getArtist()+"\n 	**********************************		\n";
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}

	

}
