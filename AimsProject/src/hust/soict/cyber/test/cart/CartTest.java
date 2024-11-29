package hust.soict.cyber.test.cart;
import java.util.ArrayList;
import hust.soict.cyber.aims.cart.Cart;
import hust.soict.cyber.aims.media.CompactDisc;
import hust.soict.cyber.aims.media.DigitalVideoDisc;
import hust.soict.cyber.aims.media.Track;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        
        cart.addMedia(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        
        cart.addMedia(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        
        cart.addMedia(dvd3);
        ArrayList<Track> tracks = new ArrayList<>();
		Track track1 = new Track("Whiplash", 8);
		Track track2 = new Track("Supernova", 9);
		Track track3 = new Track("Licorice", 8);
		tracks.add(track2);
		tracks.add(track1);
		CompactDisc cd = new CompactDisc("Supernova", "aespa", tracks, 25.66f);
		CompactDisc cd2 = new CompactDisc("Whiplash", "aespa", tracks, 30f);
//		System.out.println(cd2.getLength());
		cd.addTrack(track3);
		cart.addMedia(cd);
		cart.addMedia(cd2);
        cart.receipt();
	}

}