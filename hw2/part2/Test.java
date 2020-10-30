package cs520.hw2.part2;

public class Test {

public static void main(String[] args) {
	String courseName="CS520";
	int costPerCredit = 760;
	int numberOfCredit =4;
	int technologyFee = 60;

		Course currentCourse = null;   
		currentCourse = new Course(courseName,costPerCredit,numberOfCredit);
			System.out.println("Taking a regular course");
	System.out.println("In the course constructor values set : ");

		currentCourse.printC();
	System.out.println("In the OnlineCourse constructor values set : ");
	OnlineCourse onlineCourse = new OnlineCourse(courseName,costPerCredit,numberOfCredit,technologyFee);
		
	currentCourse = onlineCourse;
		
		onlineCourse.printOc();
	System.out.println("Printing…..");
	System.out.println(onlineCourse);



		   }
		}
