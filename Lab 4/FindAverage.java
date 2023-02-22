public class FindAverage {
 
public static double avg(double[] num) {
       if(num.length == 0) {
           return 0;
       }
       double sum = 0;
       for(int ind = 0; ind < num.length; ind++) {
           sum += num[ind];
       }
       return sum / (double)num.length;
}

public static double avg(int[] num) {
       if(num.length == 0) {
           return 0;
       }
       int sum = 0;
       for(int ind = 0; ind < num.length; ind++) {
           sum += num[ind];
       }
	return (double)sum / (double)num.length;
}

public static void main(String[] args) {
       int[] intArray = new int[5];
      
   int min=0, max=9;   
       for(int ind = 0; ind < intArray.length; ind++) {
           intArray[ind] = (int)(Math.random()*((max-min)+1))+min;
       }
       System.out.println("Average of the integer array is: " + String.format("%.2f", avg(intArray)));

       double[] doubleArray = new double[6];
       
       for(int ind = 0; ind < doubleArray.length; ind++) {
           doubleArray[ind] = (Math.random()*((max-min)+1))+min;
       }
       System.out.println("Average of the double array is: " + String.format("%.2f", avg(doubleArray)));
   }
}