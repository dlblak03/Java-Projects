package problem_2;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class circles extends Application {

	public void start(Stage primaryStage) {
		//Group to add all the objects to 
		Group root = new Group();
		//Random generator to get a random number value
		Random generator = new Random();
		//Declaring to Circle objects
		Circle cir = null;
		Circle largestcircle = null;
		//Initializing a radius to compare to zero since the first circle created will automatically be bigger than 0
		int radiustocompare = 0;
		
		//For loop to generate the 10 circles
		for(int i = 0; i < 10; i++) {
			//x and y values are random locations the circles will be placed
			int x = generator.nextInt(400) + 100;
			int y = generator.nextInt(400) + 100;
			//Radius will be random as well
			int radius = generator.nextInt(75) + 1;			
			
			//Creates the new circle object with the values generated
			cir = new Circle(x, y, radius);
			//Sets the color to null and has a black stroke so we can see where the circles are on the screen
			cir.setFill(null);
			cir.setStroke(Color.BLACK);
			cir.setStrokeWidth(1);
			//Adds the circle to the group root
			root.getChildren().add(cir);
			
			//Checks to see if the radius of the circle is larger than the one that was made prior to it
			if(radius >= radiustocompare) {
				//If it is, it duplicates that object so we can set the fill color later in the program
				largestcircle = cir;
				//Sets the new radius to compare value since it is larger
				radiustocompare = radius;
			}
		}
		//Sets the largest circle fill color to red at a 30% opacity
		largestcircle.setFill(Color.rgb(255, 0, 0, 0.3));
		
		//Creates a new scene to display root
		Scene scene = new Scene(root, 550, 550, Color.WHITE);
		
		//Sets the stage so we can show it on the screen
		primaryStage.setTitle("Random Circles");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
