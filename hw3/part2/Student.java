package cs520.hw3.part2;

public class Student {

	private String name;
	private int homework1;
	private int homework2;
	private int homework3;
	private int homework4;
	private int homework5;
	private int homework6;
	Student(String name) {
	this.name = name; 
	}

	public void sethomework1(int homework1){
		this.homework1 = homework1;
	}

	public void sethomework2(int homework2) {
		this.homework2 = homework2;
	}

	public void sethomework3(int homework3) {
		this.homework3 = homework3;
	}

	public void sethomework4(int homework4) {
		this.homework4 = homework4;
	}

	public void sethomework5(int homework5) {
		this.homework5 = homework5;
	}

	public void sethomework6 (int homework6) {
		this.homework6 = homework6;
	}

	public void setName(String name) {
	       this.name = name;
	}
	
	public double computeGrade() {
	return (homework1 + homework2 + homework3 + homework4 + homework5 + homework6) / 6 ;
	}
	
	public String toString() {
	return  name+"'s Average grade is "+ computeGrade();
	}
	
}
	   
	  