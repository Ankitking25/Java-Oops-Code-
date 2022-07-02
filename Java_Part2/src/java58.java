import java.util.Scanner;
class java58
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number of element store in array");
		int n = obj.nextInt();
		int num[] =  new int[n];
		for(int i=0;i<n;i++)
		{
			num[i] = obj.nextInt();
			System.out.println("Value of the num is = "+num[i]);
		}
	}
}
