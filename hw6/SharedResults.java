package cs520.hw6;

public class SharedResults {
	  
	   //instance variable
	   private int result;
	  
	   //get method to return result
	   public synchronized int getResult(){
	      
	       return result;
	   }
	  
	   public synchronized void addToResult(int number){
	      
	       result += number;
	       System.out.println(Thread.currentThread().getName() + " is adding "
	               + number + ", Cumulative Result is " + getResult());
	      
	      
	   }

	}