/*Getting input from user in 2D Array:-*/
import java.util.Scanner;
class java63
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int num[][] = new int[3][4];
		int a = obj.nextInt();
		System.out.println("Enter number of element is = "+a);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				num[i][j] = obj.nextInt();
			}
		}
		System.out.println("Value of num[0][1] = "+num[0][1]);
	}
}