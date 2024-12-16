package hust.soict.cybersec.aims.screen;

import java.awt.Button;
import java.awt.event.ActionEvent;

import hust.soict.cyber.aims.cart.Cart;
import hust.soict.cyber.aims.media.Media;
import hust.soict.cyber.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
	private Cart cart;
	
	@FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
    
    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private TableView<Media> tblMedia;
    
    @FXML
    private TextField tfFilter;
    
    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;

    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize() {
    	 colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
    	    colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
    	    colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
    	    tblMedia.setItems(this.cart.getItemsOrdered());
        
        btnPlay.setVisible(false);
        btnRemove.setVisible(false);
        
        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observable, Media oldValue,
                                        Media newValue) {
                        if (newValue != null) {
                            updateButtonBar(newValue);
                        }
                    }

					void updateButtonBar(Media media) {
						// TODO Auto-generated method stub
						btnRemove.setVisible(true);
						if(media instanceof Playable) {
							btnPlay.setVisible(true);
						} else {
							btnPlay.setVisible(false);
						}
					}
					
                });
        tfFilter.textProperty().addListener(
                new ChangeListener<String>() {

					@Override
					public void changed(ObservableValue<? extends String> Observable, String oldValue,
							String newValue) {
						// TODO Auto-generated method stub
						showFilterMedia(newValue);
					}
					public void showFilterMedia(String filterText) {
					    FilteredList<Media> filteredMediaList = new FilteredList<>(cart.getItemsOrdered());

					    filteredMediaList.setPredicate(media -> {
					        if (filterText == null || filterText.isEmpty()) {
					            return true;
					        }
					        if (radioBtnFilterId.isSelected()) {
					            // Filter by ID
					            return media.getId().contains(filterText);
					        } else if (radioBtnFilterTitle.isSelected()) {
					            // Filter by title
					            return media.getTitle().toLowerCase().contains(filterText.toLowerCase());
					        } else {
					            return true;
					        }
					    });

					    tblMedia.setItems(filteredMediaList);
					}
					
					
                	
                });
    }
    
    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    }
    
    
}