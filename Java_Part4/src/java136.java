import java.util.Scanner;
public class java136
{
	public static void main(String args[])
	{
		//H
		ere an unchecked exception;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter A");
		int a = obj.nextInt();
		System.out.println("Enter B");
		int b=obj.nextInt();
		int c=a/b;
		System.out.println("Division "+c);
		System.out.println("Rest of the code");
		System.out.println("Program continue");
	}
}