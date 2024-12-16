package hust.soict.cyber.aims;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.cyber.aims.cart.Cart;
import hust.soict.cyber.aims.media.Media;
import hust.soict.cyber.aims.media.Track;
import hust.soict.cyber.aims.store.Store;
import hust.soict.cyber.aims.media.DigitalVideoDisc;
import hust.soict.cyber.aims.media.Book;
import hust.soict.cyber.aims.media.CompactDisc;
public class Aims {

	public static void main(String[] args) {
		private static Store store = new Store();
	    private static Cart cart = new Cart();
	    private static Scanner scanner = new Scanner(System.in);
	    
	    
		        //Create a new cart
				Cart anOrder = new Cart();
				store.addMedia(new DigitalVideoDisc("The Matrix", "Sci-Fi", "The Wachowskis", 120, 20.0f));
		        store.addMedia(new CompactDisc("Greatest Hits", "Music", 15.0f, ["Queen"], null));
		        store.addMedia(new Book("Java Programming", "Education", 30.0f));
				//Create new DVD objects and add them to the cart
				DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
						"Animation", "Roger Allers", 87, 19.95f);
				anOrder.addMedia(dvd1);
				
				DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars",
						"Science Fiction", "George Lucas", 87, 24.95f);
				anOrder.addMedia(dvd2);
				
				DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", 
						"Animation", 18.99f);
				anOrder.addMedia(dvd3);
				
				// Remove disc from the cart to check code successfully running
				anOrder.removeMedia(dvd1);
//				ArrayList<String> authors = new ArrayList<>();
//				authors.add("Thomas");
//				authors.add("Peter");
//				Media book1 = new Book("Silence", "Horror", authors, 8.5f);
//				System.out.println(book1.toString());
				ArrayList<Track> tracks = new ArrayList<>();
				Track track1 = new Track("Whiplash", 8);
				Track track2 = new Track("Supernova", 9);
				Track track3 = new Track("Licorice", 8);
				tracks.add(track2);
				tracks.add(track1);
				CompactDisc cd = new CompactDisc("Supernova", "aespa", tracks, 25.66f);
				anOrder.addMedia(cd);
				cd.addTrack(track3);
				CompactDisc cd2 = new CompactDisc("Whiplash", "aespa", tracks, 30f);
				anOrder.addMedia(cd2);
//				cd.play();
//				System.out.println(cd.getLength());	
//              Print total cost of the items in the cart
				System.out.println("Total Cost is: ");
				System.out.println(anOrder.totalCost());
				
				int choice;
				do {
				    showMenu();
				    choice = scanner.nextInt();
				    scanner.nextLine(); // Consume newline
				    switch (choice) {
				        case 1:
				            viewStore();
				            break;
				        case 2:
				            updateStore();
				            break; 
				        case 3:
				            seeCurrentCart();
				            break;
				        case 0:
				            System.out.println("Exiting AIMS. Goodbye!");
				            break;
				        default:
				            System.out.println("Invalid choice. Please try again.");
				            break;
				    }
				} while (choice != 0);
	            }
				// Main menu
			    public static void showMenu() {
			        System.out.println("AIMS: ");
			        System.out.println("--------------------------------");
			        System.out.println("1. View store");
			        System.out.println("2. Update store");
			        System.out.println("3. See current cart");
			        System.out.println("0. Exit");
			        System.out.println("--------------------------------");
			        System.out.println("Please choose a number: 0-1-2-3");
			    }
//			    Store menu
			    public static void storeMenu() {
			    	System.out.println("Options: ");
			    	System.out.println("--------------------------------");
			    	System.out.println("1. See a media’s details");
			    	System.out.println("2. Add a media to cart");
			    	System.out.println("3. Play a media");
			    	System.out.println("4. See current cart");
			    	System.out.println("0. Back");
			    	System.out.println("--------------------------------");
			    	System.out.println("Please choose a number: 0-1-2-3-4");
			    }
			    public static void updateStore() {
		            System.out.println("Options: ");
		            System.out.println("1. Add a media to the store");
		            System.out.println("2. Remove a media from the store");
		            System.out.print("Please choose: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            switch (choice) {
		                case 1:
		                    System.out.println("Adding media feature not fully implemented.");
		                    // Additional code to add media can be added here
		                    break;
		                case 2:
		                    System.out.print("Enter the title of the media to remove: ");
		                    String title = scanner.nextLine();
		                    Media media = store.findMediaByTitle(title);
		                    if (media != null) {
		                        store.removeMedia(media);
		                        System.out.println("Media removed from the store.");
		                    } else {
		                        System.out.println("Media not found.");
		                    }
		                    break;
		                default:
		                    System.out.println("Invalid choice.");
		            }
		        }
			    public static void viewStore() {
			        store.displayItems();
			        int choice;
			        do {
			            showMenu();
			            choice = scanner.nextInt();
			            scanner.nextLine(); // Consume newline
			            switch (choice) {
			                case 1:
			                    viewStore();
			                    break;
			                case 2:
			                    updateStore();
			                    break; // Thêm break để tránh fall-through
			                case 3:
			                    seeCurrentCart();
			                    break;
			                case 0:
			                    System.out.println("Exiting AIMS. Goodbye!");
			                    break;
			                default:
			                    System.out.println("Invalid choice. Please try again.");
			                    break;
			            }
			        } while (choice != 0);

			        public static void playMedia() {
			            System.out.print("Enter the title of the media to play: ");
			            String title = scanner.nextLine();
			            Media media = store.findMediaByTitle(title);
			            if (media != null && media instanceof Playable) {
			                Playable playable = (Playable) media; // Explicit cast
			                playable.play();
			            } else if (media == null) {
			                System.out.println("Media not found.");
			            } else {
			                System.out.println("This media cannot be played.");
			            }
			        }

			        public static void seeMediaDetails() {
			            System.out.print("Enter the title of the media: ");
			            String title = scanner.nextLine();
			            Media media = store.findMediaByTitle(title);
			            if (media != null) {
			                System.out.println(media);
			                int choice;
			                do {
			                    mediaDetailsMenu();
			                    choice = scanner.nextInt();
			                    scanner.nextLine(); // Consume newline
			                    switch (choice) {
			                        case 1: // Add to cart
			                            cart.addMedia(media);
			                            break;
			                        case 2: // Play
			                            if (media instanceof Playable) {
			                                Playable playable = (Playable) media; // Explicit cast
			                                playable.play();
			                            } else {
			                                System.out.println("This media cannot be played.");
			                            }
			                            break;
			                        case 0: // Back
			                            System.out.println("Returning to store menu.");
			                            break;
			                        default:
			                            System.out.println("Invalid choice. Please try again.");
			                    }
			                } while (choice != 0);
			            } else {
			                System.out.println("Media not found.");
			            }
			        }

			        public static void addToCartFromStore() {
			            System.out.print("Enter the title of the media: ");
			            String title = scanner.nextLine();
			            Media media = store.findMediaByTitle(title);
			            if (media != null) {
			                cart.addMedia(media);
			                System.out.println("Media added to cart.");
			            } else {
			                System.out.println("Media not found.");
			            }
			        }

			        

			        public static void seeCurrentCart() {
			            cart.displayCart();
			            int choice;
			            do {
			                cartMenu();
			                choice = scanner.nextInt();
			                scanner.nextLine(); // Consume newline
			                switch (choice) {
			                    case 1:
			                        cart.filterMedia();
			                        break;
			                    case 2:
			                        cart.sortMedia();
			                        break;
			                    case 3:
			                        cart.removeFromCart();
			                        break;
			                    case 4:
			                        cart.playMedia();
			                        break;
			                    case 5:
			                        System.out.println("Order placed!");
			                        cart.clear();
			                        break;
			                    case 0:
			                        System.out.println("Returning to main menu.");
			                        break;
			                    default:
			                        System.out.println("Invalid choice. Please try again.");
			                }
			            } while (choice != 0);
			        }

	}
	
}
