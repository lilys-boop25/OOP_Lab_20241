package hust.soict.cyber.aims.cart;
import hust.soict.cyber.aims.media.Media;
import java.util.ArrayList;
import java.util.Collection.sort(collection, Media.COMPARE_BY_TITLE_COST)
public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public Cart() {

	}
	// add item into cart
	public void addMedia(Media item) {
		if(itemsOrdered.contains(item)) {
			System.out.println("Item is already in cart");
		} else {
			itemsOrdered.add(item);
			System.out.println("Item added successfully");
		}
	}
	//remove item from cart
	public void removeMedia(Media item) {
		if(itemsOrdered.contains(item)) {
			itemsOrdered.remove(item);
			System.out.println("Item removed successfully");
		} else {
			System.out.println("Item not found");
		}
	}
	// Calculate the cart
		public float totalCost() {
			float total = 0;
			for(Media item : itemsOrdered) {
				total += item.getCost();
			}
			return total;
		}
	public void receipt() {
	    System.out.println("***********************CART***********************");
	    System.out.println("Ordered Items:");
	    float totalCost = 0;

	    for (Media item : itemsOrdered) {
	        int i = item.getId();
	        System.out.println(i + ". " + item.toString());
	        totalCost += item.getCost();
	    }

	    System.out.println("Total cost: " + totalCost + " $");
	    System.out.println("***************************************************");
	}
	public void searchById(int id) {
	    boolean found = false;

	    for (Media dvd : itemsOrdered) {
	        if (dvd.getId() == id) {
	            System.out.println("Item found: " + dvd.toString());
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("No item found with ID: " + id);
	    }
	}
	public void searchByTitle(String title) {
	    boolean found = false;

	    for (Media item : itemsOrdered) {
	        if (item.isMatch(title)) {
	            System.out.println("Item found: " + item.toString());
	            found = true;
	        }
	    }

	    if (!found) {
	        System.out.println("No item found with title: \"" + title + "\"");
	    }
	}
	
}
