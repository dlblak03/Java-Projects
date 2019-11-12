package problem_1;

public class Parallelepiped extends GeometricShape {
	
	//Parallelepiped instance variables for the width, length, and the height
	private double width;
	private double length;
	private double height;
	
	//Constructor that accepts three parameters to initialize the width, length, and the height
	public Parallelepiped(double w, double l, double h) {
		width = w;
		length = l;
		height = h;
	}
	
	//Getter method for the width
	public double getWidth() {
		return width;
	}
	
	//Getter method for the length
	public double getLength() {
		return length;
	}
	
	//Getter method for the height
	public double getHeight() {
		return height;
	}
	
	//Method to calculate the surface area of the parallelepiped
	public double SurfaceArea() {
		double surfacearea;
		
		surfacearea = (2 * width * length) + (2 * length * height) + (2 * height * width);
		
		return surfacearea; 
	}
	
	//Method to calculate the volume of the parallelepiped
	public double Volume() {
		double volume;
		
		volume = length * width * height;
		
		return volume; 
	}
	
	//toString method that neatly prints out the type and all the values that describe the shape
	public String toString() {
		String name = "Parallelepiped \n";
		String w = "Width: " + Double.toString(getWidth()) + "\n";
		String l = "Length: " + Double.toString(getLength()) + "\n";
		String h = "Height: " + Double.toString(getHeight()) + "\n";
		String v = "Volume: " + Double.toString(Volume()) + "\n";
		String s = "Surface Area: " + Double.toString(SurfaceArea()) + "\n";
		
		return name + w + l + h + v + s;
	}
	
}
