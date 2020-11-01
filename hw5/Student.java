package cs520.hw5;

import java.util.ArrayList;


public class Student {
    //variables
    String name;
    double average;
    
    //homework ArrayList
    private final ArrayList<Integer> homeworks= new ArrayList<>();
    
    //Constructor
    public Student(String studentName, int grade)
    {
        this.name=studentName;
         homeworks.add(0);
    }
   
    public void setName(String named)
    {
        name = named;
    }
    
    public String getName()
    {
        return name;
    }
    //method homework grade
    public void addHomeworkGrade(int homeworkGrade)
    {
        homeworks.add(homeworkGrade);
    }
    //method computeAverage
    public double computeAverage()
    {
        ArrayList<Integer> list = new ArrayList<>(homeworks);
        double total;
        long sum = 0;
        int n = list.size();
        for (int i =0; i<n; i++)
            sum += list.get(i);
        return ((double)sum)/n;// return the average
    }  
    //Overriding the toString method
    @Override
    public String toString(){
        return "The" +name+"'s average grade is" +computeAverage();
    }
}
