import java.util.Scanner;
public class java138
{
	public static void main (String arg[])
	{
		try
		{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter A");
		int a = obj.nextInt();
		System.out.println("Enter B");
		int b= obj.nextInt();
		int c=a/b;
		System.out.println("Division = "+c);  //form here the exception is taken
		System.out.println("Rest of the code");    //below from exception the code must not be read
		System.out.println("Program continue");    //no matter we handle exception or not if the code is below in exception handle then the code not execute
		}
		//control come to catch when an exception is throw from try 
		catch(ArithmeticException e)
		{
			System.out.println("Divison by zero Not possible");
		}
		System.out.println("After catch");
	}
	
}
//Just see 182 for more basic