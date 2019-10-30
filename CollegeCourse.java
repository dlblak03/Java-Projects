package problem_1;

public class CollegeCourse {

		//Instance variables
		private String CourseTitle;
		private String CourseNumber;
		private Double CreditHours;
		private char LetterGrade;
		
		//Constructor that accepts three parameters
		public CollegeCourse( String title, String number, Double hours) {
			CourseTitle = title;
			this.CourseNumber = number;
			this.CreditHours = hours;
		}
		
		//Get method for the credit hours
		public Double getCreditHours() {
			return CreditHours;
		}
		
		//Set method to set the credit hours
		public void setCreditHours(Double hours) {
			CreditHours = hours;
		}
		
		//Get method for letter grade
		public char getLetterGrade() {
			return LetterGrade;
		}
		
		//Set method for letter grade
		public void setLetterGrade(char grade) {
			LetterGrade = grade;
		}
		
		//toString method
		public String toString() {
			String title = "Course Title: ";
			String number = "Course Number: ";
			String hours = "Credit Hours: ";
			String grade = "Letter Grade: ";
			return (title + CourseTitle + "\n" + number + CourseNumber + "\n" + hours + CreditHours + "\n" + grade + LetterGrade + "\n");
		}
		
		//Equals method to test whether two objects are equal
		public void equals(CollegeCourse inCourse) {
				boolean comp1 = this.CourseNumber.equals(inCourse.CourseNumber);
				boolean comp2 = this.CreditHours.equals(inCourse.CreditHours);
				
				if( comp1 == comp2) 
					System.out.println("The two courses are equal.");
				else
					System.out.println("The two courses are not equal.");
		}
}
