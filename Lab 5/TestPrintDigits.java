import java.util.Scanner;

public class TestPrintDigits {
//I cannot figure out how to get this to use int and not strings sorry
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some numbers: ");
        String input = in.nextLine();
        int i =0;

        for(i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);

            System.out.println(letter);
        }
    }
}