//Default mean nothing
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
	int a=10;   //Default keyword
	void show()
	{
		System.out.println("A = "+a);
	}
}

class Dell extends Laptop  //sub class
{
	public int b=20;        
	public int total=a+b;      
	public void showprice()
	{
		show();  
		System.out.println("B = "+b);
		System.out.println("Total = "+total);
	}
}