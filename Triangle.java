package problem_1;

import java.text.DecimalFormat;

public class Triangle {
	
	//Instance variables
	private int vertex1x, vertex1y, vertex2x, vertex2y, vertex3x, vertex3y;
	private double E, F, G;
	private double area, perimeter;
	
	//Decimal format to round to two decimal places
	private static DecimalFormat two =new DecimalFormat("0.00");
	
	//Constructor that has 6 parameters for the vertices
	public Triangle(int vert1x, int vert1y, int vert2x, int vert2y, int vert3x, int vert3y){
		vertex1x = vert1x;
		vertex1y = vert1y;
		vertex2x = vert2x;
		vertex2y = vert2y;
		vertex3x = vert3x;
		vertex3y = vert3y;
	}
	
	//Calculates the lengths of each side
	public void getLengths() {
		E = Math.sqrt((Math.pow(vertex2x - vertex1x, 2)) + (Math.pow(vertex2y - vertex1y, 2)));
		F = Math.sqrt((Math.pow(vertex3x - vertex2x, 2)) + (Math.pow(vertex3y - vertex2y, 2)));
		G = Math.sqrt((Math.pow(vertex1x - vertex3x, 2)) + (Math.pow(vertex1y - vertex3y, 2)));
	}
	
	//Calculates the perimeter by adding the side lengths
	public double getPerimeter() {
		perimeter = E + F + G;
		
		return perimeter;
	}
	
	//Calculates area by taking the square root of what is inside the parenthesis, this equation is know as Heron's formula
	public double getArea() {
		double H = perimeter / 2;
		
		area = Math.sqrt(H * (H-E) * (H-F) * (H-G));
		
		return area;
	}
	
	//toString method that neatly displays all the information within the object
	public String toString() {
		
		//Organizes the vertices into coordinate pairs
		String Vertex1 = "(" + vertex1x + ", " + vertex1y + ")";
		String Vertex2 = "(" + vertex2x + ", " + vertex2y + ")";
		String Vertex3 = "(" + vertex3x + ", " + vertex3y + ")";
		
		//Rounds the lengths to two decimals
		String Length1 = two.format(E);
		String Length2 = two.format(F);
		String Length3 = two.format(G);
		
		//Rounds area and perimeter to two decimals
		String A = two.format(area);
		String Peri = two.format(perimeter);
		
		//Connects all the strings together to one variable that way the final string can be returned
		String Result = "Triangle Object Values\nVertex 1: " + Vertex1 + "\nVertex 2: " + Vertex2 + "\nVertex 3: " + Vertex3;
		String Result2 = Result + "\nLength 1 = " + Length1 + "\nLength 2 = " + Length2 + "\nLength 3 = " + Length3;
		String FinalResult = Result2 + "\nArea = " + A + " units^2"+ "\nPerimeter = " + Peri;
		
		return FinalResult;
	}
}
