import java.util.Scanner;
public class DisplayPyramid
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int z=0,n = 0;
		
		System.out.print("Enter an integer from 1 to 9 : ");

		n = sc.nextInt();

		for (int i = 1; i <= n; i++)
		{
		for (int j = 1; j<= 2*n - z; j++)
		{

		System.out.print(" ");
		}
		for (int k = i; k >= 1; k--)
		{

		System.out.print(k+" ");
		}
		for (int l = 2; l <= i; l++)
		{

		System.out.print(l+" ");
		}
		System.out.println();
		z=z+2;
		}
	}
}