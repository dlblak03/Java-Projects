package problem_1;

import java.util.Scanner;

public class ShapesCollection {
	
	//Array to store all the geometric shapes
	static GeometricShape[] shapes = new GeometricShape[10];
	
	public static void main(String args[]) {
		//Scanners to get all the necessary variables to create a shape
		Scanner shapetype = new Scanner(System.in);
		Scanner numofshapes = new Scanner(System.in);
		Scanner radius = new Scanner(System.in);
		Scanner width = new Scanner(System.in);
		Scanner length = new Scanner(System.in);
		Scanner height = new Scanner(System.in);
		Scanner order = new Scanner(System.in);
		
		//Asks the user how many shapes he/she wants to make
		System.out.println("Enter the amount of shapes you want to make (10 Max): ");
		//Scans that number to the variable nos (numberofshapes)
		int nos = numofshapes.nextInt();
		
		//Creates a copy of that number for later use
		int tempnos = nos;
		//This will be used to create a new object and the desired index of the GeometricShape array
		int i = 0;
		
		//While loop to create the number of shapes the user wants to create
		while(nos > 0) {
			//Variable to get the type of shape the user wants to make
			String shape;
			//Variable that will verify if the user entered a valid shape
			int var = -1;
			
			//Where the user will enter the type of shape
			do {
				System.out.println("What type of shape would you like to make? (Sphere or Parallelepiped)");
				shape = shapetype.nextLine();
				if(shape.equals("Sphere")) 
					var = shape.compareTo("Sphere");
				else if(shape.equals("Parallelepiped"))
					var = shape.compareTo("Parallelepiped");
			} while(var != 0);
			
			//If the shape is a sphere, it will run this if statement and get the needed values
			if(shape.equals("Sphere")) {
				System.out.println("Enter the radius of the sphere: ");
				double r = radius.nextDouble();
				shapes[i] = new Sphere(r);
			}
			//If it is a parallelepiped, it will run this and get the needed values
			else if(shape.equals("Parallelepiped")) {
				System.out.println("Enter the width of the parallelepiped: ");
				double w = width.nextDouble();
				System.out.println("Enter the length of the parallelepiped: ");
				double l = length.nextDouble();
				System.out.println("Enter the height of the parallelepiped: ");
				double h = height.nextDouble();
				shapes[i] = new Parallelepiped(w, l, h);
			}	
			//Decreases nos so we make the right amount of shapes
			nos--;
			//Increases i because we don't want to make a object in an array index we already made
			i++;
		}
		
		//Asks the user how they want to sort the shapes
		System.out.println("Do you want to sort the shapes by 1. Ascending order based on Volume or 2. Ascending order based on Surface Area?");
		int sort = order.nextInt();
		
		//If it is by volume, then this block of code will run
		if(sort == 1) {
			for(int index = 0; index < tempnos; index++) {	
				if(shapes[index + 1] != null) {
				 
					double compare1 = shapes[index].Volume();
					double compare2 = shapes[index + 1].Volume();

					if(compare1 > compare2) {
						GeometricShape[] tempshapes = new GeometricShape[1];
						tempshapes[0] = shapes[index];
						shapes[index] = shapes[index + 1];
						shapes[index + 1] = tempshapes[0];
						index = -1;	
					}
				} 
			}
		}
		
		//If it is by surface area, then this block of code will run
		if(sort == 2) {
			for(int index = 0; index < tempnos; index++) {	
				if(shapes[index + 1] != null) {
				 
					double compare1 = shapes[index].SurfaceArea();
					double compare2 = shapes[index + 1].SurfaceArea();

					if(compare1 > compare2) {
						GeometricShape[] tempshapes = new GeometricShape[1];
						tempshapes[0] = shapes[index];
						shapes[index] = shapes[index + 1];
						shapes[index + 1] = tempshapes[0];
						index = -1;	
					}
				} 
			}
		}
		
		//For loop to print out all the shapes, checks to see it does not print out a null value of the array
		for(GeometricShape s: shapes) {
			if(s != null)
				System.out.println(s);
		}
		
		//Closes all the scanners
		numofshapes.close();
		shapetype.close();
		radius.close();
		width.close();
		length.close();
		height.close();
		order.close();
	}
}
