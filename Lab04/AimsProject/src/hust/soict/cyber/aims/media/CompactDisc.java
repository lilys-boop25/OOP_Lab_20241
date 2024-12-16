package hust.soict.cyber.aims.media;
import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.cybersec.aims.exception.PlayerException;

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
	
	
	public void play() throws PlayerException{
		if (this.getLength() > 0) {
	        // TODO Play all tracks in the CD as you have implemented
	        Iterator<Track> iter = tracks.iterator();
	        Track nextTrack;
	        while (iter.hasNext()) {
	            nextTrack = (Track) iter.next();
	            try {
	                nextTrack.play();
	            } catch (PlayerException e) {
	                throw e;
	            }
	        }
	    } else {
	        throw new PlayerException("ERROR: CD length is non-positive!");
	    }
	 }

}
