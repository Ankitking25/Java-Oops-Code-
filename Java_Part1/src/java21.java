//do while loop 
import java.util.Scanner;
class java21
{
	public static void main (String args[])
	{
		Scanner obj = new Scanner(System.in);
		int i;
		System.out.println("Enter 0 to exit");
		do
		{
			System.out.println("Enter any integers");
			i=obj.nextInt();
			System.out.println("You Entered : "+i);
		}
		while(i!=0);//semicolon is important
		//whenever while condition is false the program get break
	}
}