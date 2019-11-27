package problem_2;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class CCurvePane extends Pane {
	
	//Constructor for CCurvePane
	public CCurvePane() {
		makeCCurve(1);
	}
	
	//Makes a CCurve with the specified order
	public void makeCCurve(int order) {
		getChildren().clear();
		addLine(order, 340, 200, 340, 400);
	}
	
	//Adds the lines to the CCurve, recursive function
	public void addLine(int order, double x1, double y1, double x3, double y3) {
		double deltaX, deltaY, x2, y2;
		
		//Base case when the order is 1
		if(order == 1) {
			getChildren().add(new Line(x1, y1, x3, y3));
		}
		else {
			//Gets the new coordinates for the new line segments
			deltaX = x1 +x3 + y1 - y3;
			deltaY = x3 + y1 + y3 - x1;
			
			x2 = deltaX / 2;
			y2 = deltaY / 2;
			
			//Recursive call to get the order down to 1
			addLine(order - 1, x1, y1, x2, y2);
			addLine(order - 1, x2, y2, x3, y3);
		}
	}
}
