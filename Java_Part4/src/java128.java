//public keyword is access in anywhere in program
class java128
{
	public static void  main (String args[])
	{
		Dell obj = new Dell();
		obj.showprice();
	}
}


class Laptop    //super class
{
	public int a=10;   //public mean go for inheritance
	public void show()
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