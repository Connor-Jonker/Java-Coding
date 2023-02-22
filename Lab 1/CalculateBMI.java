import java.util.Scanner;
public class CalculateBMI {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("\nInput height in meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.printf("BMI = %.2f%n", BMI);
   }
}