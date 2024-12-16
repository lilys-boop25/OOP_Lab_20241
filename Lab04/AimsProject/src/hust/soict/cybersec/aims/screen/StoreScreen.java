package hust.soict.cybersec.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JFrame;

import hust.soict.cyber.aims.media.Media;
import hust.soict.cyber.aims.store.Store;

public class StoreScreen extends JFrame{
	private Store store;
	
	public StoreScreen(Store store) {
		  this.store = store;
		  Container cp = getContentPane();
		  cp.setLayout(new BorderLayout());
		  cp.add(createNorth(), BorderLayout.NORTH);
		  cp.add(createCenter(), BorderLayout.CENTER);
		  setVisible(true);
		  setTitle("Store");
		  setSize(1024, 768);
		}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	JMenuBar createMenuBar() {
		
	        // Create the main menu
	        JMenu menu = new JMenu("Options");

	        // Create a submenu
	        JMenu smUpdateStore = new JMenu("Update Store");
	        smUpdateStore.add(new JMenuItem("Add Book"));
	        smUpdateStore.add(new JMenuItem("Add CD"));
	        smUpdateStore.add(new JMenuItem("Add DVD"));

	        // Add submenu to main menu
	        menu.add(smUpdateStore);

	        // Add additional menu items
	        menu.add(new JMenuItem("View store"));
	        menu.add(new JMenuItem("View cart"));

	        // Create the menu bar and set layout
	        JMenuBar menuBar = new JMenuBar();
	        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
	        menuBar.add(menu);

	        return menuBar;
	    }
	JPanel createHeader() {
        // Tạo JPanel cho header
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        // Tạo JLabel cho tiêu đề
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        // Tạo JButton cho "View cart"
        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        // Thêm các khoảng cách và thành phần vào header
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }
	JPanel createCenter() {
        // Tạo JPanel cho center
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        // Giả sử store.getItemsInStore() trả về một danh sách các Media
        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i = 0; i < 9; i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }
}
