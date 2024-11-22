
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	int qtyOrdered = 0;
	// Add DVD to cart
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered] = disc;  // Add the disc to cart
	        qtyOrdered++;
	        System.out.println("The disc has been added");
		} else {
			System.out.println("The cart is almost full");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		for(DigitalVideoDisc dvd : dvdList) {
			if(qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemOrdered[qtyOrdered] = dvd;
				qtyOrdered++;
		        System.out.println("The disc has been added");
			} else {
				System.out.println("The cart is almost full");
			}
		}
	}
public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		
	}
	// Remove DVD from cart
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean found = false;
		for(int i = 1; i < qtyOrdered; i++) {
			if(itemOrdered[i] == disc) {// check if DVD exists in the cart
				for(int j = i; j < qtyOrdered - 1; j++) {
					itemOrdered[j] = itemOrdered[j + 1];
				}
			    itemOrdered[qtyOrdered - 1] = null;
			    qtyOrdered--;
			    found = true;
                System.out.println("The disc has been removed from the cart.");
                break;
			}
		}
		if(!found) {
			System.out.println("This disc is not in the cart.");
		}
	}
	// Calculate the cart
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemOrdered[i].getCost();
		}
		return total;
	}
	public void receipt() {
	    System.out.println("***********************CART***********************");
	    System.out.println("Ordered Items:");
	    float totalCost = 0;

	    for (int i = 0; i < itemOrdered.length; i++) {
	        DigitalVideoDisc dvd = itemOrdered[i];
	        System.out.println((i + 1) + ". " + dvd.toString());
	        totalCost += dvd.getCost();
	    }

	    System.out.println("Total cost: " + totalCost + " $");
	    System.out.println("***************************************************");
	}
	public void searchById(int id) {
	    boolean found = false;

	    for (DigitalVideoDisc dvd : itemOrdered) {
	        if (dvd.getId() == id) {
	            System.out.println("DVD found: " + dvd.toString());
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("No DVD found with ID: " + id);
	    }
	}
	public void searchByTitle(String title) {
	    boolean found = false;

	    for (DigitalVideoDisc dvd : itemOrdered) {
	        if (dvd.isMatch(title)) {
	            System.out.println("DVD found: " + dvd.toString());
	            found = true;
	        }
	    }

	    if (!found) {
	        System.out.println("No DVD found with title: \"" + title + "\"");
	    }
	}
}
