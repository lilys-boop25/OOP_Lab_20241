package hust.soict.cyber.aims.store;
import java.util.ArrayList;
import hust.soict.cyber.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>(); // List to store DVDs

    // Constructor
    public Store() {

    }


    public void addMedia(Media dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("Added DVD: " + dvd.getTitle());
        } else {
            System.out.println("Cannot add null DVD.");
        }
    }

    public void removeMedia(Media dvd) {
        if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);
            System.out.println("Removed DVD: " + dvd.getTitle());
        } else {
            System.out.println("DVD not found in store.");
        }
    }


    public void printStore() {
        System.out.println("***********************STORE***********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            for (Media item : itemsInStore) {
                System.out.println(item.getId() + ". " + item.toString());
            }
        }
        System.out.println("***************************************************");
    }
}
