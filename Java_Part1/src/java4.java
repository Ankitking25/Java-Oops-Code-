class Example
{
	int a,b,total;
	void add()
	{
		total=a+b;
	}
}

class java4
{
	public static void main(String args[])
	{
	Example obj = new Example();
	obj.a = 10;
	obj.b = 20;
	obj.add();
	System.out.println("Sum of the numbers is "+obj.total);
	}
}