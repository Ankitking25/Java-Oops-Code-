//int add()    remainber a one thing here that int method in place of void method
//{            there are various method that use in place of int like, void,float,disp
//    int a=10,b=20;
//    return(a+b);

class java35
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
		return(a+b);
	}
	int mult(int p)
	{
		int k = p;
		return (k * k);
	}
}
