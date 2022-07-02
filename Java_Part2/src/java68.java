/*Dynamic memory allocation row and column number in taken by user*/
import java.util.Scanner;
class java68
{
	public static void main (String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int m = obj.nextInt();
		System.out.println("Enter no of columns: ");
		int n = obj.nextInt();
		int num[][] = new int[m][n];
		System.out.println("Enter value: ");
		for(int i=0;i<num.length;i++)   //num.length = no. of row = m
		{
			for(int j=0;j<num[0].length;j++)   //num[0].length = no. of column = n
			{
				num[i][j] = obj.nextInt();
			}
		}
		System.out.println("You Entered");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println(num[i][j]);
			}
		}
		
	}
}