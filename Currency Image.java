package problem_2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Currency extends Application {

	public void start(Stage primaryStage) {
		//Creating the coin shapes and colors
		Circle quarter = new Circle(100, 100, 60);
		quarter.setFill(Color.SILVER);
		
		Circle dime = new Circle(240, 100, 49.2);
		dime.setFill(Color.SILVER);
		
		Circle nickel = new Circle(370, 100, 55);
		nickel.setFill(Color.SILVER);
		
		Circle penny = new Circle(500, 100, 51.4);
		penny.setFill(Color.rgb(205, 127, 50));
		
		//Grouping the coins together to an object called coins
		Group coins = new Group(quarter, dime, nickel, penny);
		
		//Creating the text that will go inside the coins
		Text quarter2 = new Text(68, 110, "25\u00A2");
		quarter2.setFill(Color.rgb(70, 70, 70));
		quarter2.setFont(Font.font("Verdana", 35));
		
		Text dime2 = new Text(217, 109, "10\u00A2");
		dime2.setFill(Color.rgb(70, 70, 70));
		dime2.setFont(Font.font("Verdana", 25));
		
		Text nickel2 = new Text(350, 110, "5\u00A2");
		nickel2.setFill(Color.rgb(70, 70, 70));
		nickel2.setFont(Font.font("Verdana", 30));
		
		Text penny2 = new Text(485, 107, "1\u00A2");
		penny2.setFill(Color.rgb(128, 74, 0));
		penny2.setFont(Font.font("Verdana", 25));
		
		//Grouping the text together to an object called value
		Group value = new Group(quarter2, dime2, nickel2, penny2);
		
		//Grouping coins and value together to a group called root
		Group root = new Group(coins, value);
		
		//Making a scene with the group root
		Scene scene = new Scene(root, 600, 200, Color.BLACK);
		
		//Displaying the scene I created
		primaryStage.setTitle("Currency");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}