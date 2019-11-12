package problem_1;

public abstract class GeometricShape {
	
	//Constant PI field
	public static double PI = Math.PI;
	
	//Abstract methods to calculate Volume and the Surface Area
	public abstract double SurfaceArea();
	public abstract double Volume();
		
	//CompareVolume method
	public int CompareVolume(double v1, double v2) {
		
		int compare = -2;
		
		if(v1 == v2)
			compare = 0;
		else if(v1 > v2)
			compare = 1;
		else if(v1 < v2)
			compare = -1;
		
		return compare;
	}
	
	//CompareSurfaceArea method
	public int CompareSurface(double s1, double s2) {
		
		int compare = -2;
		
		if(s1 == s2)
			compare = 0;
		else if(s1 > s2)
			compare = 1;
		else if(s1 < s2)
			compare = -1;
		
		return compare;
	}
}
