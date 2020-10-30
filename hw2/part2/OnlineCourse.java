package cs520.hw2.part2;

public class OnlineCourse extends Course {

private int technologyFee;
	
	public OnlineCourse(String courseName, int costPerCredit,
	int numberOfCredits, int technologyFee) {
	super(courseName, costPerCredit, numberOfCredits);
			this.technologyFee = technologyFee;
	   }
	
	public int getTechnologyFee() {
	return technologyFee;
	   }

	public void setTechnologyFee(int technologyFee) {
	this.technologyFee = technologyFee;
	   }

	
	@Override
	public int getTotalTuition() {
	return getTechnologyFee() + super.getTotalTuition();
	   }

	@Override
	public String toString() {
	return"OnlineCourse [technologyFee=" + technologyFee
	               + ", getCourseName()=" + getCourseName()
	               + ", getCostPerCredit()=" + getCostPerCredit()
	               + ", getNumberOfCredits()=" + getNumberOfCredits();
	   }
                   

public void printOc(){

System.out.println("CourseName = "+ getCourseName()+", CostPerCredit = $"+getCostPerCredit() +"  NumberOfCredits = "+ getNumberOfCredits()+" TechnologyFee = $"+ getTechnologyFee());

}

	}

