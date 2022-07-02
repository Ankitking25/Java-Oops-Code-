//Example of Exception in java
import java.util.Scanner;
public class java134 

{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
		int c=a/b;           //Let if b=0 enter by zero then exception is taken
		System.out.println("Division = "+c);
		System.out.println("Rest of the code");
		System.out.println("Program continue");
	}

}
