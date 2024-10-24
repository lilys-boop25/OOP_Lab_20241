
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
}
