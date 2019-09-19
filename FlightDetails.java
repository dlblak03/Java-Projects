package problem_2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FlightDetails extends Application{
	
	//Launches the Flight Details application
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new FlightPane(), 400, 400);
		
		primaryStage.setTitle("Flight Details");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
