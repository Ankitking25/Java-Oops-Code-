//labeled break statement
class  java74
{
	public static void main(String args[])
	{
		geek:
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==3)
				{
					continue geek;  //when i=3 then it continue a outer for loop means skip it
				}
			   System.out.print("*");
			}
			System.out.println();
		}
	}
}