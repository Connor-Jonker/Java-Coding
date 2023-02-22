import java.util.*;

class TestPrintStringReversely {
	
    public static void main(String args[]) {   
	    //gets the user to input text
        System.out.println("Enter some text: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();  
	    //Reverses the text and outputs it
        System.out.println("Reverse String: ");
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='a') continue;
            else
            System.out.print(str.charAt(i));
        }
    }

}