import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore; // List to store DVDs

    // Constructor
    public Store() {
        this.itemsInStore = new ArrayList<>();
    }


    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("Added DVD: " + dvd.getTitle());
        } else {
            System.out.println("Cannot add null DVD.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
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
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
            }
        }
        System.out.println("***************************************************");
    }
}
