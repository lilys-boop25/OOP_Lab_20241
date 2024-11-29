package hust.soict.cyber.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
public int compare(Media item1, Media item2) {
    // Compare by cost in descending order
	int costComparison = Double.compare(item1.getCost(), item2.getCost());
	if(costComparison == 0)
		return item1.getTitle().compareToIgnoreCase(item2.getTitle());
	return costComparison;
	}
}
