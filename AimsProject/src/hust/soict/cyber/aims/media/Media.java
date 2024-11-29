package hust.soict.cyber.aims.media;
import java.util.Comparator;

public abstract class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
	private static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	private static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByTitleCost();
	public Media() {
         
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	
	public boolean isMatch(String title) {
	    return this.title.equalsIgnoreCase(title.trim());
	}
	@Override
    public boolean equals(Object obj) {
        // Check if the object is the same reference
        if (this == obj) {
            return true;
        }
        // Check if the object is an instance of Media
        if (!(obj instanceof Media)) {
            return false;
        }
        // Cast obj to Media
        Media otherMedia = (Media) obj;
        // Compare titles
        return this.title != null ? this.title.equals(otherMedia.title) : otherMedia.title == null;
    }
    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}
