//How we overcome with the hiding of super class method by super keyword
//syntax;
//super.method_name()

class java117
{
	public static void main(String arg[])
	{
		Second obj = new Second();
		obj.put();
	}
}
class First
{
	int a =100;
	void disp()
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
	void put()  //we just make a new method name put and call it is Strat
	{
		super.disp();  //here we just only call super disp method 
		disp();       //here we call second disp method
	}
}