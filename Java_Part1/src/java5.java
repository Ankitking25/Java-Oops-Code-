//making the sum, subtraction , Addition and Division in the funtion and access it
/*by the object making class*/
class First
{ 
	int a = 10;
	float b=20.23f,total;
	void Sum()
	{
	   total=a+b;	
	}
}
class java5
{
	public static void main(String args[])
	{
	    First obj = new First();
	    obj.Sum();
	    System.out.println("The outcome is = "+obj.total);
	
	}
}
