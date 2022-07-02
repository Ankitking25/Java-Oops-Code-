import java.util.Scanner;
class java71
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int num[][] = new int[3][];
		num[0] = new int[3];
		num[1] = new int[2];
		num[2] = new int[1];
		System.out.println("Enter VAlue");
		for(int i=0;i<num.length;i++)
		 {
			for(int j=0;j<num[i].length;j++)
			{
				num[i][j] = obj.nextInt();
			}
	      }
		System.out.println("YOu entered");
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
