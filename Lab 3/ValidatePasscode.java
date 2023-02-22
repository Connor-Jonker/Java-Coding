import java.util.*;
public class ValidatePasscode

{
public static boolean passcode(String str)
	{
	if(str.length()<8)
	{
return false;
}
	else
		{
		int f_n=0,f_a=0,f_s=0;
			for(int i=0;i<str.length();i++)
			{
			if(Character.isDigit(str.charAt(i)))
			{
			f_n=1;
			}
			if(Character.isLetter(str.charAt(i)))
			{
			f_a=1;
			}
			if(str.charAt(i)=='!' || str.charAt(i)=='@' || str.charAt(i)=='#' || str.charAt(i)=='$')
			{
			f_s=1;
			}
		}
		if(f_a==1 && f_s==1 && f_n==1)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
}
   public static void main(String[] args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a passcode: ");
   String pass=sc.nextLine();
   System.out.print("Output passcode valid :"+passcode(pass));
   }
}