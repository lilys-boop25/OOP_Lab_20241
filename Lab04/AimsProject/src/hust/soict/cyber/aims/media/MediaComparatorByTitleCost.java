package hust.soict.cyber.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
public int compare(Media item1, Media item2) {
    // Compare by cost in descending order
	int titleComparison = Comparator.comparing(Media::getCost).
		    thenComparing(Media::getTitle).compare(item1, item2);

    return titleComparison;
	}
}
