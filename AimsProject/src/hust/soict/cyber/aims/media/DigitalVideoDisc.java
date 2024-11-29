package hust.soict.cyber.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	

	public String getDirector() {
		    return director;
	}
	public int getLength() {
		    return length;
	}
	public DigitalVideoDisc(String title) {
		    super();
		    this.title = title;
	}
	 public DigitalVideoDisc(String title, String category, float cost) {
	        this.title = title;
	        this.category = category;
	        this.cost = cost;
	        nbDigitalVideoDiscs++;
	        this.id = nbDigitalVideoDiscs;
	    }
	 public DigitalVideoDisc(String title, String category, String director, float cost) {
	        this.title = title;
	        this.category = category;
	        this.director = director;
//	        this.cost = cost;
	        nbDigitalVideoDiscs++;
	        this.id = nbDigitalVideoDiscs;
	    }
	 public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
	        this.title = title;
	        this.category = category;
	        this.director = director;
	        this.length = length;
	        this.cost = cost;
	        nbDigitalVideoDiscs++;
	        this.id = nbDigitalVideoDiscs;
	    }
	 
	 public String toString() {
		    if(length == 0 && director == null) {
		    	return "DVD - " + title + " - " + category + ": " + cost + " $";
		    } else if(length == 0) {
		    	return "DVD - " + title + " - " + category + " - " + director + ": " + cost + " $";
		    } else {
		    	return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
		    }
		}
	 public void play() {
		 System.out.println("Playing DVD: " + this.getTitle());
		 System.out.println("DVD length: " + this.getLength());
		 }
}
