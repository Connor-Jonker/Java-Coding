public class DisplaySomeNumbers {
   public static void main(String[] args) {
       int value = 1;

       int count = 0;

       while(value <=100) {
           if(   (value%6 == 0 && value%7!=0) ||
                   (value%6 != 0 && value%7==0))
           {
               System.out.printf("%2d ",value);
               count++;
           }
           value++;
           if(count == 5) {
               System.out.println();
               count = 0;
           }
       }
   }
}