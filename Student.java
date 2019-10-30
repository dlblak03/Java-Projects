package problem_1;

public class Student {
	
	//Instance variables
	private int ID_number;
	private CollegeCourse[] St_Courses = new CollegeCourse[6];
	private double SEM_GPA;
	
	//Constructor that accepts one parameter
	public Student( int number) {
		ID_number = number;
	}
	
	//Accessor method for ID number
	public int getID_number() {
		return ID_number;
	}

	//Mutator method for ID number
	public void setID_number( int number ) {
		ID_number = number;
	}
	
	//Accessor method for college course at a certain index
	public String getCollegeCourse( int index ) {
		return St_Courses[index].toString();
	}

	//Mutator method that sets a college course to a certain index of the CollegeCourse array
	public void setCollegeCourse( int index, CollegeCourse inCourse ) {
		St_Courses[index] = inCourse;
	}
	
	//Method that returns the students GPA
	public double getSEM_GPA() {
		double tempgpa = 0;
		double temphours = 0;
		double temphours2 = 0;
		char tempgrade;
		
		for( int id = 0; id < 6; id++) {
			if(St_Courses[id] != null) {
				tempgrade = St_Courses[id].getLetterGrade();
				temphours = St_Courses[id].getCreditHours();
				
				if(tempgrade == 'A') 
					tempgpa += (4.00 * temphours); 
				else if(tempgrade == 'B') 
					tempgpa += (3.00 * temphours);
				else if(tempgrade == 'C') 
					tempgpa += 2.00 * temphours;
				else if(tempgrade == 'D')
					tempgpa += 1.00 * temphours;
				else if(tempgrade == 'F')
					tempgpa += 0.00 *temphours;
					
				temphours2 += temphours;
			}
		}
		
		SEM_GPA = tempgpa / temphours2;
		
		return SEM_GPA;
	}
	
	//toString method for the Student class
	public String toString() {
		String studentinfo = ID_number + "\n";
		String courseprint = "";
		
		for( CollegeCourse x : St_Courses) {
			courseprint += x;
		}
		
		return studentinfo + courseprint;
	}
}
