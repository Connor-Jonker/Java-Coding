import java.util.*; 
class FindAreaCode {

    public static void main(String[] args) {
        String code;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a phone number: ");
        String numberWithCode = sc.nextLine();
        numberWithCode = numberWithCode.replaceAll("\\s", "");
if (numberWithCode.charAt(0) == '(' || numberWithCode.charAt(4) == ')') {
	code = numberWithCode.substring(1, 4);
} else if (numberWithCode.charAt(0) != '(' && numberWithCode.charAt(4) == ')') {
	code = numberWithCode.substring(0, 4);
} else {
	code = numberWithCode.substring(0, 3);
}

System.out.println("The area code is " + code);
sc.close();
    }
}