/*Dynamic Memory Allocation in java*/
import java.util.Scanner;
class java57
{
	public static void main (String args[])
	{
		Scanner obj = new Scanner(System.in);
        System.out.println("NO of Elements: ");
        int n = obj.nextInt();
        int num[] = new int[n];
        System.out.println("Enter" +n+ "Integers");
        for(int i=0;i<n;i++)
        {
        	num[i] = obj.nextInt();
        }
        
	}
}