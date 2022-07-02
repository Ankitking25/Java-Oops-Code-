//Private class only use in its class or we say the range of private class
//not run the program just only for learn
class java130
{
	public static void  main (String args[])
	{
		Dell obj = new Dell();
		obj.showprice();
	}
}


class Laptop    //super class
{
	private int a=10;   //public mean go for inheritance
	private void show()
	{
		System.out.println("A = "+a);
	}
}

class Dell extends Laptop  //sub class
{
	public int b=20;        
	public int total=a+b;       //red underline on a mean not access a variable of a here
	public void showprice()
	{
		show();   //we cannot call the show method because it is private method that mean its scope only in its class method
		System.out.println("B = "+b);
		System.out.println("Total = "+total);
	}
}