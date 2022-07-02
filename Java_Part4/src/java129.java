//Protected keyword use upto its subclass or we say range of the protected keyword
class java129
{
	public static void  main (String args[])
	{
		Dell obj = new Dell();
		obj.showprice();
	}
}
class Laptop    //super class
{
	protected int a=10;   //protected mean it inheritance up to its sub class or sub package
	protected void show()
	{
		System.out.println("A = "+a);
	}
}

class Dell extends Laptop  //sub class
{
	public int b=20;          //public mean full access
	public int total=a+b;         //Both a and b are public so inheritanc is possible
	public void showprice()
	{
		show();   //calling of the method show the super class method
		System.out.println("B = "+b);
		System.out.println("Total = "+total);
	}
}