//
class java47
{
	public static void main (String args[])
	{
		Game1 obj = new Game1();
		obj.disp();
	}
}

class Game
{
	static int add()  //static method
	{
		int x=10,y=20;  //Local method
		int z = x+y;
		return z;
	}
}
class Game1
{
	void disp()   //Instance method
	{
		int a = Game.add();     //calling static method that is not in Game1 class
		//Notice that here Game.add() is calling not only add()  because static class Game and instance class Game1 both are different class
		//so we have required an object of an static class like here Game
		System.out.println("Addition = "+a);
	}
}