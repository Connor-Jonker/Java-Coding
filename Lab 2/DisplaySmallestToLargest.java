import java.util.*;

public class DisplaySmallestToLargest {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
	System.out.print("Enter three integers: ");
	int x = sc.nextInt();
	int y = sc.nextInt(); 
	int z = sc.nextInt(); 
if (x < y) {
	int temp = x;
	x = y;
	y = temp;
}
if (y < z) {
	int temp = y;
	y = z;
	z = temp;
}
if (x < y) {
	int temp = x;
	x = y;
	y = temp;
}
	System.out.println("The sorted numbers are " + x + "," + y + "," + z);
	}
}