package cs520.hw5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Test {


public static void main(String[] args) {
    // Create queue of student objects
    Queue<Student> studentQueue;
    studentQueue = new LinkedList<>();


    // Create map of Student objects
    HashMap<String, Student> studentMap = new HashMap<String, Student>();

    // Open and read text file 
    String inputFileName1 = "data.txt";
    FileReader fileReader = null;

    // Create the FileReader object
    try 
    {
        fileReader = new FileReader(inputFileName1);
    } 
    catch (FileNotFoundException e)
    {
        e.printStackTrace();
    }
    // BufferReader read file
    
    BufferedReader reader = new BufferedReader(fileReader);
    String input_line;
    System.out.println("Input File Processing...");
    
    // Read one line at a time until end of file
    try 
    {
        input_line = reader.readLine();
        
        while (input_line != null) 
        {
                             
    Student st1=processInputData(input_line);
    studentQueue.add(st1); 
    studentMap.put(st1.name,st1);
    input_line = reader.readLine();
        
        }
        
//iterating using queue
        
        Iterator iterator;
        iterator = studentQueue.iterator();
      
        System.out.println ( "Iterating over the student list: ");
      
        while (iterator.hasNext())
        {
        System.out.println ( iterator.next()); 
        }

   //Retrieving from the hashmap
        Set key_s = studentMap.keySet();
        Iterator itr = key_s.iterator();
 
        String key_val;
        Student value;
       
        System.out.println("Iterating over Students map...");
        
        while(itr.hasNext())
        {
            key_val = (String)itr.next();
            value = (Student)studentMap.get(key_val);
            System.out.println( value);
        }
    
    } 
    catch (IOException e)
    {
        e.printStackTrace();
    }
    // Close the input
    try 
    {
        fileReader.close();
    } 

    catch (IOException e) {
        e.printStackTrace();
    }
}

private  static Student processInputData(String d) 
{
    StringTokenizer s_t = new StringTokenizer(d, ",");
    String str = s_t.nextToken();
    int hk1 = Integer.parseInt(s_t.nextToken());
    int hk2 = Integer.parseInt(s_t.nextToken());
    int hk3 = Integer.parseInt(s_t.nextToken());
    int hk4 = Integer.parseInt(s_t.nextToken());
    int hk5 = Integer.parseInt(s_t.nextToken());
    int hk6 = Integer.parseInt(s_t.nextToken());

    // Using the set methods
    Student currentStudent =new Student (str);
    currentStudent.setName(str);
    currentStudent.addHomeworkGrade(hk6);
    currentStudent.addHomeworkGrade(hk1);
    currentStudent.addHomeworkGrade(hk2);
    currentStudent.addHomeworkGrade(hk3);
    currentStudent.addHomeworkGrade(hk4);
    currentStudent.addHomeworkGrade(hk5);
    currentStudent.addHomeworkGrade(hk6);
    
    System.out.println(currentStudent);
 
return currentStudent;        
}
}