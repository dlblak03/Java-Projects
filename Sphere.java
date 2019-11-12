package problem_1;

public class Sphere extends GeometricShape {
	
	//Sphere instance variable for the radius
	private double radius;
	
	//Constructor that accepts a parameter to initialize the radius
	public Sphere(double r) {
		radius = r;
	}
	
	//Getter method to return the radius
	public double getRadius() {
		return radius;
	}
	
	//Method to calculate the surface area of the sphere
	public double SurfaceArea() {
		double surfacearea;
		
		surfacearea = 4 * GeometricShape.PI * Math.pow(radius, 2);
		
		return surfacearea;
	}
	
	//Method to calculate the volume of the of the sphere
	public double Volume() {
		double volume;
		
		volume = (4.0 / 3.0) * GeometricShape.PI * Math.pow(radius, 3);
		
		return volume;
	}
	
	//toString method that neatly prints out the type and all the values that describe the shape
	public String toString() {
		String name = "Sphere \n";
		String r = "Radius: " + radius + "\n";
		String v = "Volume: " + Double.toString(Volume()) + "\n";
		String s = "Surface Area: " + Double.toString(SurfaceArea()) + "\n";
		
		return name + r + v + s;
	}
}
