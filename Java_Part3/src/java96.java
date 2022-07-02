//final keyword with Parameter
class java96
{
	public static void main(String args[])
	{
		Spider obj = new Spider();
		obj.disp(10);
	}
}
class Spider
{
	void disp(final int a)  //method not constructor
	{
		//Cannot do like int a = 102;
		System.out.println("A:"+a);
	}
}