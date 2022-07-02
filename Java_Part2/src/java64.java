/*Getting input user for 2d Array*/
import java.util.Scanner;
class java64
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Value : ");
		int[][] num  = new int[3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				num[i][j] = obj.nextInt();
			}
		}
		System.out.println("You Entered");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("value is "+num[i][j]);
			}
			System.out.println();
		}
	
	}
}
