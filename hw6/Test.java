package cs520.hw6;

public class Test {
	  
	   public static void main(String[] args){
	  
	   //create Shared results object
	   SharedResults results = new SharedResults();
	  
	   //create 5 long tasks 
	   Thread longTask1 = new LongTask(results, 1, 100);
	   longTask1.start();
	  
	   Thread longTask2 = new LongTask(results, 101, 200);
	   longTask2.start();
	  
	   Thread longTask3 = new LongTask(results, 201, 300);
	   longTask3.start();
	  
	   Thread longTask4 = new LongTask(results, 301, 400);
	   longTask4.start();
	  
	   Thread longTask5 = new LongTask(results, 401, 500);
	   longTask5.start();
	  
	   //use join method 
	   try {
	      
	       longTask1.join();
	       longTask2.join();
	       longTask3.join();
	       longTask4.join();
	       longTask5.join();
	      
	   }
	  
	   catch (InterruptedException e){
	      
	       e.printStackTrace();
	      
	   }
	  
	   //when threads done result will printed
	   System.out.println("Result = " + results.getResult());
	  
	  
	   }

	}