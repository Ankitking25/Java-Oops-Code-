//Getting input from user in one D-Array;
import java.util.Scanner;
class java53
{
	public static void main (String args[])
	{
		Scanner obj = new Scanner(System.in);
		int num[] = new int[5];
		System.out.println("Enter 5 integers");
		for(int i=0;i<5;i++)
		{
			num[i] = obj.nextInt();
		}
		System.out.println("You Entered:");
		for(int i=0;i<5;i++)
		{
			System.out.println(num[i]);
		}
	}
}
