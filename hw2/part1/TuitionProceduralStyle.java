package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class TuitionProceduralStyle {

	public static void main(String[] args) {
		// variable declarations
		String FirstCourse;
		String SecondCourse;
		String NumCreditFirst;
		String NumCreditSecond;
		String CostPerCreditFirst;
		String CostPerCreditSecond;
		
		int CourseTuitionFirst;
		int CourseTuitionSecond;
		
		//Use dialog box to input value from user
		FirstCourse = JOptionPane.showInputDialog("Enter the First Course: ");
		NumCreditFirst = JOptionPane.showInputDialog("Enter the Number of Credit for First Course: ");
		CostPerCreditFirst = JOptionPane.showInputDialog("Enter the Cost Per Credit for First Course: ");
		
		CourseTuitionFirst = Integer.parseInt(NumCreditFirst) * Integer.parseInt(CostPerCreditFirst);
	    JOptionPane.showMessageDialog(null, "The tuition cost of "+ FirstCourse + " is $ " + CourseTuitionFirst);
	    
	    SecondCourse = JOptionPane.showInputDialog("Enter the Second Course: ");
	    NumCreditSecond = JOptionPane.showInputDialog("Enter the number of credits:");
	    CostPerCreditSecond = JOptionPane.showInputDialog("Enter the Cost Per Credit for Second Course:");
	    CourseTuitionSecond = Integer.parseInt(NumCreditSecond)
	               * Integer.parseInt(CostPerCreditSecond);
	    JOptionPane.showMessageDialog(null, "The tuition cost of "+ SecondCourse + " is $ " + CourseTuitionSecond);
		
	     // compare the tuition between two courses 
	     if (CourseTuitionFirst == CourseTuitionSecond) { 
	    	 
	    JOptionPane.showMessageDialog(null, "Both Courses have the same tuition value\n" 
	       + FirstCourse + "= $ " + CourseTuitionFirst 
	       + "\n" + SecondCourse + "= $ "+ CourseTuitionSecond);
	    } 
	       
	     else if (CourseTuitionFirst > CourseTuitionSecond) {

	    JOptionPane.showMessageDialog(null,"Tuition for the First course is greater than Second \n"
	       + FirstCourse + "= $ " + CourseTuitionFirst + "\n" + SecondCourse + "= $ "
	       + CourseTuitionSecond + "\nThe differcen between the two is = $ "
	       + (CourseTuitionFirst - CourseTuitionSecond));
	    } 
	       
	     else {
	       JOptionPane.showMessageDialog(null,"The Tuition for the Second course is greater than First \n"
	       + FirstCourse + "= $ " + CourseTuitionFirst + "\n" + SecondCourse + "= $ "+ CourseTuitionSecond
	       + "\nThe differcen between two Courses = $ " + (CourseTuitionSecond - CourseTuitionFirst));
	       }
	   }

	}

