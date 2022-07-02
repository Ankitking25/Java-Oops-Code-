//while loop in java program:
import java.util.Scanner;
class java19
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int i;
		System.out.println("Enter 0 to exit");
		while(true)
		{
			System.out.println("Enter any integer");
			i=obj.nextInt();
			if(i==0)
			{
			  System.out.println("Program Exit");
			  break;
			}
		System.out.println("YOu Entered:"+i);
		}
	}
}