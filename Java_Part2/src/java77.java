//break and continue statement in for Enhanced Looping
class java77
{
	public static void main(String args[])
	{
		int num[] = {1,2,3,4,5};
		int total = 0;
		for(int i:num)
		{
			if(i==3)
			{
				continue;  //skip the value of 3 in addition or 
			}
		    total=total+i;
		    System.out.println(total);
		}
	}
}
