package cs520.hw3.part1;

import javax.swing.JOptionPane;


public class StringTest {

public static void main(String[] args) {

	String studentInfo = JOptionPane.showInputDialog("Please enter data using the format CourseId,CourseName,Tuition");

    if (studentInfo == null)
        throw new NullPointerException();
    
    else {
        studentInfo = studentInfo.trim();
        System.out.println(studentInfo);

    int firstIndex = studentInfo.indexOf(',');
    if (firstIndex == -1) {
        System.out.println("Rentered");
        }

        String courseID = studentInfo.substring(0, firstIndex);
        System.out.println("First Comma Position:" + firstIndex+ ", Course Id:" + courseID + ", Length:"+ courseID.length());

        int secondIndex = studentInfo.indexOf(',', firstIndex + 1);
        if (secondIndex == -1) {
        System.out.println("Rentered");
           
        }

        String courseName = studentInfo.substring(firstIndex + 1,secondIndex);
        System.out.println("Second Comma Position:" + secondIndex+ ", Course Name:" + courseName + ", Length:"+ courseName.length());
        
        int thirdIndex = studentInfo.indexOf(',', secondIndex + 1);
        if (thirdIndex == -1) {
        System.out.println("Rentered");
        }

        String tuitionFee = studentInfo.substring(secondIndex + 1,studentInfo.length());
        if (tuitionFee == null) {
        System.out.println("Rentered");
        }
        
        int tuition = Integer.parseInt(tuitionFee);
        System.out.println("Regular Tution $" + tuition+ ", Discount Tuition $"+ (tuition - (tuition * 0.25)));
        
    }
  }
}