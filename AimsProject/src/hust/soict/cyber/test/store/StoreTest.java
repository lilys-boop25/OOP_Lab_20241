package hust.soict.cyber.test.store;
import hust.soict.cyber.aims.media.DigitalVideoDisc;
import hust.soict.cyber.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();

        // Create DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Test addDVD method
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        // Print current store
        store.printStore();

        // Test removeDVD method
        store.removeMedia(dvd2); // Remove "Star Wars"
//        store.printStore();

        // Try removing a non-existent DVD
        store.removeMedia(dvd2);
    
	}

}
