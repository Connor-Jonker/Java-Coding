import java.util.Scanner;

public class TestRecursiveGCD {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("The GCD of the numbers " + a + " and " + b + " is " + gcd(a, b));
    }
}