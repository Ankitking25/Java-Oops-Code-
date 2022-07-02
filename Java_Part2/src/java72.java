/*Dynamic memory allocation in jagged array in java*/
import java.util.Scanner;
class java72
{
	public static void main (String args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter no of row");
		int m = obj.nextInt();
		int num[][] = new int[m][];
		for(int i=0;i<m;i++)
		{
			System.out.println("No of element in row");
			int n = obj.nextInt();
			num[i] = new int[n];
			
		}
		System.out.println("Enter value :");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				num[i][j] = obj.nextInt();
				
			}
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.println(num[i][j]);
			}
			System.out.println();
		}
	}
}
