package problem_2;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class FlightPane extends GridPane{
	
	//Declaring Text Fields
	private TextField AirlineCompany;
	private TextField FlightNum;
	private TextField Origin;
	private TextField Arrival;
	
	public FlightPane() {
		Font font = new Font(20);
		
		//Creating new label for Airline Company
		Label Airline = new Label("Airline Company:");
		Airline.setFont(font);
		GridPane.setHalignment(Airline, HPos.RIGHT);
		
		//Creating new label for Flight Number
		Label FliNum = new Label("Flight Number:");
		FliNum.setFont(font);
		GridPane.setHalignment(FliNum, HPos.RIGHT);
		
		//Creating new label for Origin city
		Label Depart = new Label("Origin City:");
		Depart.setFont(font);
		GridPane.setHalignment(Depart, HPos.RIGHT);
		
		//Creating new label for Arrival city
		Label Arrive = new Label("Arrival City:");
		Arrive.setFont(font);
		GridPane.setHalignment(Arrive, HPos.RIGHT);
		
		//Creating text field for Airline Company
		AirlineCompany = new TextField();
		AirlineCompany.setFont(font);
		AirlineCompany.setPrefWidth(100);
		AirlineCompany.setAlignment(Pos.CENTER);
		AirlineCompany.setOnAction(this::processPrint);
		
		//Creating text field for Flight Number
		FlightNum = new TextField();
		FlightNum.setFont(font);
		FlightNum.setPrefWidth(100);
		FlightNum.setAlignment(Pos.CENTER);
		FlightNum.setOnAction(this::processPrint);
		
		//Creating text field for Origin city
		Origin = new TextField();
		Origin.setFont(font);
		Origin.setPrefWidth(100);
		Origin.setAlignment(Pos.CENTER);
		Origin.setOnAction(this::processPrint);
		
		//Creating text field for Arrival city
		Arrival = new TextField();
		Arrival.setFont(font);
		Arrival.setPrefWidth(100);
		Arrival.setAlignment(Pos.CENTER);
		Arrival.setOnAction(this::processPrint);
		
		//Button to print the flight information
		Button print = new Button("Print");
		print.setFont(font);
		print.setPrefWidth(100);
		print.setAlignment(Pos.CENTER);
		print.setOnAction(this::processPrint);
		
		//Aligning the grid pane and setting background color
		setAlignment(Pos.CENTER);
		setHgap(30);
		setVgap(20);
		setStyle("-fx-background-color: #E5E4E2");
		
		//Organizing the grid pane
		add(Airline, 0, 0);
		add(AirlineCompany, 1, 0);
		add(FliNum, 0, 1);
		add(FlightNum, 1, 1);
		add(Depart, 0, 2);
		add(Origin, 1, 2);
		add(Arrive, 0, 3);
		add(Arrival, 1, 3);	
		add(print, 1, 4);
	}
	
	//Class to handle the events
	public void processPrint(ActionEvent event) {
		
		//Declaring variables to assign my text fields to
		String AirlineComp, OriginCity, ArrivalCity, FlightNumber;
		
		//Initializing the variables with the text in the text fields 
		AirlineComp = AirlineCompany.getText().toString();
		FlightNumber = FlightNum.getText().toString();
		OriginCity = Origin.getText().toString();
		ArrivalCity = Arrival.getText().toString();
		
		//Printing out those variables to the console
		System.out.println("Flight Information");
		System.out.println(AirlineComp);
		System.out.println(FlightNumber);
		System.out.println(OriginCity);
		System.out.println(ArrivalCity);
	}	
}
