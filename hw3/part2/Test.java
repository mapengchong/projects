package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;


public class Test {
	
	public static void main(String[] args){
	       BufferedReader br = null;
	       try {
	           br = new BufferedReader(new FileReader("data.txt"));
	           String textline = br.readLine();
	       
	       while (textline != null) {
	       processInputData(textline);
	       textline = br.readLine();}
	           
	       br.close();} 
	       catch (Exception e) {
	         
	    e.printStackTrace();
}
	   }
	 
	public static void processInputData(String textline) {


	StringTokenizer str = new StringTokenizer(textline);


	int temp[] = new int[6];
	int i = 0;
	String name = str.nextToken(",");

	while(str.hasMoreTokens()) {
	temp[i] = Integer.parseInt(str.nextToken());
	i++;
}

	Student currentStudent = new Student(name);
	currentStudent.sethomework1(temp[0]);
	currentStudent.sethomework2(temp[1]);
	currentStudent.sethomework3(temp[2]);
	currentStudent.sethomework4(temp[3]);
	currentStudent.sethomework5(temp[4]);
	currentStudent.sethomework6(temp[5]);

	System.out.println(currentStudent.toString());
  }
}