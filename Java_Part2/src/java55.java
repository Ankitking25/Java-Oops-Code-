/*Calculation with Array*/
class java55
{
	public static void main(String args[])
	{
		int num[] = new int[5];
		num[0] = 11;
		num[1] = 22;
		num[2] = num[0] + num[1];  //We use array like also in java
		num[3] = num[1] + 10;   //We use array like also in java
		num[4] = num[0];     //We initailized the one array value in the second Array;
		for(int i=0;i<5;i++)
		{
			System.out.println(num[i]);
		}
	}
}
