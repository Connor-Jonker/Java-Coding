public class FindSmallestValues {

   public static int[] smallestValues(int[][] num) {
       // Create result array with input array lenght
       int[] result = new int[num.length];
      
       //Loop through each row
       for(int row = 0; row < num.length; row++) {
           // assumes the first element is the smallest element
           int smallest = num[row][0];
           // Loops through the columns for the row and finds the smallest element
           for(int column = 1; column < num[row].length; column++) {
               if(num[row][column] < smallest) {
                   smallest = num[row][column];
               }
           }
           // Place the smallest number into the row
           result[row] = smallest;
       }
       // Returns the result
       return result;
   }
   public static void main(String[] args) {
       int[][] array = new int[4][5];
       // Generates random numbers within the range of 0 to 9
   int min=0, max=9;   
       for(int row = 0; row < array.length; row++) {
           for(int column = 0; column < array[0].length; column++) {
               array[row][column] = (int)(Math.random()*((max-min)+1))+min;
           }
       }
       // Prints the array
       System.out.println("Input array:");
       for(int row = 0; row < array.length; row++) {
           for(int column = 0; column < array[0].length; column++) {
               System.out.print(array[row][column] + " ");
           }
           System.out.println();
       }
       System.out.println("\n\nsmallest:");
       int[] smallest = smallestValues(array);
       //prints the smallest number into the row
       for(int row = 0; row < array.length; row++) {
           System.out.println(smallest[row]);
       }
   }
}