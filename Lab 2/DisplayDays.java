import java.util.*;

public class DisplayDays {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int m,y;
	System.out.print("Enter a month :");
	m=sc.nextInt();
	System.out.print("Enter a year :");
	y=sc.nextInt();
switch(m)
{
	case 1: System.out.println("\nThere are 31 days in January "+y); break;
	case 2 : if((y%400==0)||((y%4==0)&&(y%100!=0)))
	System.out.print("\n There are 29 days in February "+y);
else
	System.out.print("\nThere are 28 days in February "+y);
break;
	case 3: System.out.println("\nThere are 31 days in March "+y); break;
	case 4: System.out.println("\nThere are 30 days in April "+y); break;
	case 5: System.out.println("\nThere are 31 days in May "+y); break;
	case 6 : System.out.println("\nThere are 30 days in June "+y); break;
	case 7: System.out.println("\nThere are 31 days in July "+y); break;
	case 8: System.out.println("\nThere are 31 days in August "+y); break;
	case 9: System.out.println("\nThere are 30 days in September "+y); break;
	case 10 : System.out.println("\nThere are 31 days in October "+y); break;
	case 11: System.out.println("\nThere are 30 days in November "+y); break;
	case 12: System.out.println("\nThere are 31 days in December "+y); break;
	}
}
}