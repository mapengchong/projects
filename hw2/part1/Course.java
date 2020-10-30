package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class Course { public String CourseName; public int NumCourseCredit, CostPerCredit;

	public void setCourseName(String courseName) { this.CourseName = CourseName;
	
	}

	public void setNumCourseCredit(int NumCourseCredit) { this.NumCourseCredit = NumCourseCredit;

	}

	public void setCostPerCredit(int CostPerCredit) { this.CostPerCredit = CostPerCredit;

	}

	
	public String getCourseName() { 
	return this.CourseName;
	}

	public int getNumCourseCredit() { 
	return this.NumCourseCredit;
	} 
	
	public int getCostPerCredit() { 
	return this.CostPerCredit;
	}

	public int getTotalTuition() { 
	return NumCourseCredit * CostPerCredit;
	}
	

	// print a dialog with the tuition  
	public void printTuitionDetails() {
	String result = "The Tuition for course: \n" + CourseName + " = $ " + getTotalTuition(); 
	JOptionPane.showMessageDialog(null, result);
	}

	}
