
class java46
{
	public static void main (String args[])
	{
		Game obj = new Game();
		obj.disp();
	}
}




class Game
{
	static int add()
	{
		int x=10,y=20;
		int z=x+y;
		return z;

	}
	void disp()
	{
		int a=add();
		System.out.println("Addition = "+a);
	}
}
