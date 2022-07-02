//Take user input in java by users:
import java.util.Scanner;
class java7
{
	public static void main(String args[])
	{
		int a;
		float b;
		String str;
		Scanner obj                                                                                         = new Scanner(System.in);
		System.out.print("Enter String ")                    ;
		str = obj.nextLine();
		System.out.println("String"+str);
		System.out.println("Enter Integer");
		a = obj.nextInt();
		System.out.println("Integer is "+a);
		System.out.println("Enter a float number");
		b = obj.nextFloat();
		System.out.println("The float number is "+b);
		
		
	}
}

//obj.next for one string


