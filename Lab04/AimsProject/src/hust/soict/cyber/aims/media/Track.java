package hust.soict.cyber.aims.media;

import hust.soict.cybersec.aims.exception.PlayerException;

public class Track implements Playable{
	
	private String title;
	private int length;
	public Track(String title, int length) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
	public int getLength() {
		return length;
	}
	@Override
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
            return true;
        }
        // Check if the object is an instance of Track
        if (!(obj instanceof Track)) {
            return false;
        }
        // Cast obj to Track
        Track otherTrack = (Track) obj;
        // Compare titles and lengths
        return super.equals(otherTrack) && this.length == otherTrack.length;
    }
	public void play() throws PlayerException{
		 if(this.getLength() > 0) {
			 
		 } else {
			 throw new PlayerException("Error: Track length is non-positive!");
		 }
	 }
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + length;
    }
}
