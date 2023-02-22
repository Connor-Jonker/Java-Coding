import java.io.*;

public class TestSumSeries {
 
  public static double sum(int i)
  {    
       if(i<0)
       return 0;
   
       else
       { 
       if(i%2==0)
       {   
           return((double)(i+1)/(2*i+1) + sum(i-1));
       }
       else 
	{  
	return((double)(i+2)/(2*i+1) + sum(i-1));
	}
	}
}
  public static void main(String[] args) {
  
        double result;

        for(int i=0; i<=5;i++)
        { 
     result = sum(i);

        System.out.println("s("    + i   + ") =  " + result);
        System.out.println();
      }
   }
}