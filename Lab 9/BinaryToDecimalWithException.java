import java.util.Scanner;

public class BinaryToDecimalWithException
{
 public static int main(String binaryString) throws NumberFormatException 
 {
  int decimal = 0;
  int strLength=binaryString.length();
  for (int i = 0; i < strLength; i++) 
  {
   if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
   {
    throw new NumberFormatException("The string that you input is not binary");
   }
   
   decimal += (binaryString.charAt(i)-'0') * Math.pow(2, strLength-1-i);
  }
  return decimal;
 } 
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Please enter a binary value: ");
  String str = input.nextLine();
  try
  {
   System.out.println("The corresponding decimal number is: " + main(str));
  }
  catch(NumberFormatException e)
  {
   System.out.println(e);
  }
 }
}