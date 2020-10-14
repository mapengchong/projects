package cs520.hw1;

public class Triples {

		static int arr[][] = new int[500][3];
		 
		     public static void main(String []args){
		        int sum;
		        double sqrt;
		        int sqrtC;
		        int i=0;
		        
		        for(int x=1;x<=100;x++)
		        {
		            for(int y=1;y<=100;y++)
		            {
		                sum=(x*x)+(y*y);
		                sqrt=java.lang.Math.sqrt(sum);
		                sqrtC = (int)sqrt;
		                if(sum==(sqrtC*sqrtC))
		                {
		                    if(checkRepeat(x,y,sqrtC,i))
		                    {
		                    arr[i][0]=x;
		                    arr[i][1]=y;
		                    arr[i++][2]=sqrtC;
		                    System.out.println(x+","+y+","+sqrtC);
		                    }
		                
		                }
		                
		            }
		        }
		        
		     }
		     
		     
		      public static boolean checkRepeat(int x,int y,double sqrtC,int len)
		        {
		            for(int i=0;i<len;i++)
		            {
		                 // System.out.println(i);
		                if((arr[i][0]+arr[i][1]+arr[i][2])==(x+y+sqrtC))
		                {
		                    if(x==arr[i][0])
		                    {
		                        if(y==arr[i][1])
		                        {
		                            if(sqrtC==arr[i][2])
		                            return false;
		                        }
		                        else if(y==arr[i][2])
		                        {
		                            if(sqrtC==arr[i][1])
		                            return false;
		                        }
		                    }
		                    else if(x==arr[i][1])
		                    {
		                        if(y==arr[i][0])
		                        {
		                            if(sqrtC==arr[i][2])
		                            return false;
		                        }
		                        else if(y==arr[i][2])
		                        {
		                            if(sqrtC==arr[i][0])
		                            return false;
		                        }
		                    }
		                    else if(x==arr[i][2])
		                    {
		                        if(y==arr[i][0])
		                        {
		                            if(sqrtC==arr[i][1])
		                            return false;
		                        }
		                        else if(y==arr[i][1])
		                        {
		                            if(sqrtC==arr[i][0])
		                            return false;
		                        }
		                    }
		                }
		                
		            }
		            return true;
		        }
		        

	}
