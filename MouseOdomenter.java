package problem_2;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseOdomenter extends Application {
	
	//Variables for the coordinates, distance, and text
	private Text distancetext = new Text(150, 30, "Distance: ");
	private double beginX = 0;
	private double beginY = 0;
	private double distance = 0;
	
	public void start(Stage primaryStage) {
		
		//Group to create a scene
		Group root = new Group();
		Scene scene = new Scene(root, 500, 300);	
		
		//Where the mouse being entered and moved and exited gets handled at
		scene.setOnMouseEntered(this::mouseHandler);
		scene.setOnMouseMoved(this::mouseHandler);
		scene.setOnMouseExited(this::mouseHandler);
		
		//Adds the text distance to the group to add to the scene
		root.getChildren().add(distancetext);
		
		//Displays the scene
		primaryStage.setTitle("Mouse Odometer");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//Event handler for the mouse whenever it enters the scene and is moved and when it is exited
	public void mouseHandler(MouseEvent event) {
		distance += Math.sqrt(Math.pow(event.getX() - beginX, 2) + Math.pow(event.getY() - beginY, 2));
		
		beginX = event.getX();
		beginY = event.getY();
		
		distancetext.setText("Distance: " + distance);
	}
}
