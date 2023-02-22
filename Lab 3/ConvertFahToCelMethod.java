import java.util.Scanner;

public class ConvertFahToCelMethod {

    public static void main(String arg[]) {

        Scanner input = new Scanner(System.in);
	    double C;
	    double F;
        char method;
        boolean keepGoing = true;

        do {
            System.out.print("Enter a temperature in Fahrenheit:  ");
            F = input.nextDouble();
            C = 5 * (F - 32) / 9;
            String formatted_C = String.format("%.2f", C);
            System.out.print("The temperature in Celsius is:  " + formatted_C);
            System.out.print("\nDo you want to continue? ");
            method = input.next().charAt(0);
            if (method == 'y' || method == 'Y') {
                keepGoing = true;
                System.out.println();
            } else {
                keepGoing = false;
            }
        } while (keepGoing == true);
        input.close();
    }
}