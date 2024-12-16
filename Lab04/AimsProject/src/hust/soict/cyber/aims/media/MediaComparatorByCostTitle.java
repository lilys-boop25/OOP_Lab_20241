package hust.soict.cyber.aims.media;
import java.util.Comparator;


public class MediaComparatorByCostTitle implements Comparator<Media> {
	@Override
    public int compare(Media item1, Media item2) {
		// compare title
		int titleComparison = Comparator.comparing(Media::getTitle).
				    thenComparing(Media::getCost).compare(item1, item2);
	
		return titleComparison;
	}
}
