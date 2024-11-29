package hust.soict.cyber.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
	public CompactDisc(String title, String artist, ArrayList<Track> tracks, float cost) {
		// TODO Auto-generated constructor stub
		super();
		this.cost = cost;
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}
	public String getArtist() {
		return artist;
	}
	public int getLength() {
		int totalLength = 0;
		for(Track track : tracks) {
			totalLength += track.getLength();
		}
		return this.length = totalLength;
	}
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Track is already in the list.");
		} else {
			tracks.add(track);
			System.out.println("Track added successfully.");
		}
	}
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Track removed successfully.");
		} else {
			System.out.println("Track not found in the list.");
		}
	}
	
	public String toString() {
		return "CD - " + title + " - " + artist + " - " + length + ": " + cost + " $";
	}
	
	public void play() {
        System.out.println("Playing Compact Disc: " + this.getTitle());
        System.out.println("Artist: " + this.artist);
        System.out.println("CD length: " + this.getLength() + " minutes");
        for (Track track : tracks) {
            track.play(); // Call the play method of each track
        }
    }

}
