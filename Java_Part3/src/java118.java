//Not run , Just for the program that how and where we use super keyword in super class
class java117
{
	public static void main(String arg[])
	{
		Second obj = new Second();
		obj.disp();
	}
}
class First
{
	int a =100;
	void super.disp()   //Always try with previous logic
	{
		System.out.println("Value of a is = "+a);
	}
}
class Second extends First
{
	int b =200;
	void disp()
	{
		System.out.println("Value of b is = "+b);
	}
}