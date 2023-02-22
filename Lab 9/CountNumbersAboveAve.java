import java.util.*;
//Couldn't Figure out how to do this without an array
public class CountNumbersAboveAve {
    public static void main(String[] args)
    {
        Random r = new Random();
        int nxt;
        int[] arr = new int[10];
        float avg = 0;
      
        System.out.println("\nRandomly generated 10 numbers are :\n");
        for(int i = 0; i < 10; i++)
       {
           nxt = r.nextInt(100);
           arr[i] = nxt;
           avg += nxt;
          
           // Printing the random Number
           System.out.print(nxt+" ");
       }
       avg = avg/10;
       System.out.printf("\n\nAverage is %.2f\n", avg);
      
        System.out.println("\nNumbers above average are :");
        for(int i = 0; i < 10; i++)
       {
           if(arr[i] > avg)
               System.out.print(arr[i]+" ");
       }
       System.out.println("\n");
   }
}