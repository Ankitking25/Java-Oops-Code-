class java36
{
	public static void main (String args[])
	{
		Test obj = new Test();
		System.out.println(obj.add());
		int r = obj.mult(5);
		System.out.println(r);
	}
}

class Test
{
	int add()
	{
		int a = 10 , b = 20;
		return(a+b);  //return statement
	}
	int mult(int p)
	{
		int k = p;
		return (k * k); //return statement
	}
}