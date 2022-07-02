//Enhanced for Loop with Array
class java78
{
	public static void main(String args[])
	{
		int num[][] = {{11,22},{33,44},{55,66}};
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[0].length;j++)
			{
				System.out.println(num[i][j]);
			
			}
			System.out.println();
		}
		
		//Enhanced for Loop in java
		for(int i[] : num)  //here i[] =  basically scan the first array {11,22}
			for(int j:i)  //here i=11,22 or j start with 0;
			{
				System.out.println(j+" ");
			}
			System.out.println();
		}
	}
}