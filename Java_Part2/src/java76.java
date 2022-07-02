//Enhanced for loop // we also use break or continue
class java76
{
	public static void main(String args[])
	{
		int num[] = {11,22,33,44,55};
		int total = 0;
		
		for(int i : num)  //Syntax
		{  
			total = total + i;
			System.out.println(i);
		}
		System.out.println("Total = "+total);
	}
}
