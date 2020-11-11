package cs520.hw6;

import java.util.Random;

public class LongTask extends Thread {
  
   //instance variables
   private SharedResults sharedData;
   private int start, end;
  
   //constructor defines name of thread and instance variables
   public LongTask(SharedResults sharedData, int start, int end){
      
       super("Thread_" + start + "_" + end);
       this.sharedData = sharedData;
       this.start = start;
       this.end = end;
      
   }
  
   //run method
   public void run(){
      
       //sum stores 
       int sum = 0;
       Random gen = new Random();
      
       for (int a = start; a <= end; a++){
           sum += a;
           long sleepTime = gen.nextInt(10);

           try {
               sleep(sleepTime);
           } catch (InterruptedException e) {
              
               e.printStackTrace();
   
           }
          
       }
      
       sharedData.addToResult(sum);
      
   }

}