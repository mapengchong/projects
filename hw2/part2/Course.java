package cs520.hw2.part2;

class Course {
	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;

	public Course(String courseName, int costPerCredit, int numberOfCredits) {
	this.courseName = courseName;
	this.costPerCredit = costPerCredit;
	this.numberOfCredits = numberOfCredits;
	   }
	
	public void setCourseName(String courseName) {
	this.courseName = courseName;
	   }
	
	public int getCostPerCredit() {
	return costPerCredit;
	   }

public int getNumberOfCredits()
{
return this.numberOfCredits;
}
	
public String getCourseName()
{
return this.courseName;
}
	public void setCostPerCredit(int costPerCredit) {
	this.costPerCredit = costPerCredit;}

public void printC(){
System.out.println("CourseName = "+ getCourseName()+", CostPerCredit = $"+getCostPerCredit() +"  NumberOfCredits = "+ getNumberOfCredits());

}
	   
	
	
	
	public void setNumberOfCredits(int numberOfCredits) {
	this.numberOfCredits = numberOfCredits;
	   }
	
	public int getTotalTuition() {
	return costPerCredit * numberOfCredits;
	   }
	
	@Override
	public String toString() {
	return"Course: "+ "<" + courseName + ">" + "@ $"+ costPerCredit * numberOfCredits;
	   }

	}

		  


