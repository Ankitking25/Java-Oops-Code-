//method overloading with same method and different in number of argument
class java43
{

	public static void main(String args[])
	{
		Addition obj = new Addition();
		obj.disp(10);
		obj.disp(10,20);
	}
}



class Addition 
{
	void disp(int a)
	{
		int x=a;
		System.out.println("Value of A = "+a);
	}
	void disp(int a, int b)
	{
		int x=a;
		int y=b;
		int z=x*y;
		System.out.println("Multiplication = "+z);
	}
}
