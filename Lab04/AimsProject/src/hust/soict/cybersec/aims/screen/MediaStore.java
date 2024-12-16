package hust.soict.cybersec.aims.screen;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

import hust.soict.cyber.aims.media.Media;
import hust.soict.cyber.aims.media.Playable;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Title label
        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        // Cost label
        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        // Container panel for buttons
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        container.add(new JButton("Add to cart"));

        if (media instanceof Playable) {
            container.add(new JButton("Play"));
        }

        // Adding components to MediaStore panel
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        // Set border for the MediaStore panel
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
