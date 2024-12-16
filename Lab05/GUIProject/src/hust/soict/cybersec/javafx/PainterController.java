package hust.soict.cybersec.javafx;
import java.awt.Color;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
public class PainterController {


	

	    @FXML
	    private Pane drawingAreaPane;

	    @FXML
	    void clearButtonPressed(ActionEvent event) {
	    	drawingAreaPane.getChildren().clear();
	    }

	    @FXML
	    void drawingAreaMouseDragged(MouseEvent event) {
	    	Circle newCircle = new Circle(event.getX(), event.getY(), 4);
	    	newCircle.setFill(Color.BLACK);
	    	drawingAreaPane.getChildren().add(newCircle);
	    	
	    }


}
