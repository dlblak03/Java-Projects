package problem_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CCurveFractal extends Application {
	
	//Max and Min for the Order
	private final static int MIN_ORDER = 1;
	private final static int MAX_ORDER = 13;
	
	//Order counter, buttons, text, and CCurvePane to make the fractal
	private int ORDER;
	private Button Up, Down;
	private Text orderText;
	private CCurvePane fractalPane;
	
	public void start(Stage primaryStage) {
		
		//Creates a new button to increase the order
		Up = new Button();
		Up.setText("Up");
		Up.setOnAction(this::processUpButtonPress);
		
		//Creates a new button to decrease the order
		Down = new Button();
		Down.setText("Down");
		Down.setOnAction(this::processDownButtonPress);
		Down.setDisable(true);
		
		//Default when the program first starts
		ORDER = 1;
		orderText = new Text("Order: 1");
		orderText.setFill(Color.WHITE);
		
		//The header where the buttons and order number will be at
		HBox header = new HBox();
		header.setStyle("-fx-background-color: black");
		header.setAlignment(Pos.CENTER);
		header.setPrefHeight(50);
		header.setSpacing(40);
		header.getChildren().addAll(Up, orderText, Down);
		
		//Creates the pane for the fractal
		fractalPane = new CCurvePane();
		
		//Groups the header and pane together
		VBox root = new VBox();
		root.setStyle("-fx-background-color: white");
		root.getChildren().addAll(header, fractalPane);
		
		//Displays the stage in a window
		Scene scene = new Scene(root, 600, 650);
		primaryStage.setTitle("C-Curve Fractal");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//Event handler for when the Up button is pressed
	public void processUpButtonPress(ActionEvent event) {
		//Increases order and the text and then makes a new fractal of that order
		ORDER++;
		orderText.setText("Order: " + ORDER);
		fractalPane.makeCCurve(ORDER);
		
		//Enables the Down button since the order can be decreased
		Down.setDisable(false);
		if(ORDER == MAX_ORDER)
			//Disables the Up button since the max order has been reached
			Up.setDisable(true);
	}
	
	public void processDownButtonPress(ActionEvent event) {
		//Decreases order and the text and then makes a new fractal of that order
		ORDER--;
		orderText.setText("Order: " + ORDER);
		fractalPane.makeCCurve(ORDER);
		
		//Enables the Up button since the order can be increased
		Up.setDisable(false);
		if(ORDER == MIN_ORDER)
			//Disables the Down button since the min order has been reached
				Down.setDisable(true);
	}
}
