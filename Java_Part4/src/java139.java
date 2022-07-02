import java.util.Scanner;
public class java139
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter A");
		int a = obj.nextInt();
		System.out.println("Enter B");
		int b = obj.nextInt();
		try{
		int c=a/b;
		System.out.println("the division of a and b "+c);
		}
		catch(ArithmeticException e )
		{
			try
			{
			int d=100/0;   //new exception
			System.out.println("D is ="+d);   //not seen on output screen because of below of exception in try class
			System.out.println("I am the Catch");  //not seem on output as according to try rule
			}
			catch(ArithmeticException f)  //Here initailized by new value f
			{
				System.out.println("Nested catch exception handling in java");
			}//Nested try and catch as a above example
		}
	}
}