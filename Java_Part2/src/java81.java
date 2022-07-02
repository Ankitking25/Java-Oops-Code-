class java81
{
	public static void main(String args[])
	{
		Game obj = new Game();  //here Game is also a constructor for initilzed an object
	}  //remainmber one thing here we cannot call any method because constructor automatically call by itself
}

class Game
{
	int a;
	Game()
	{
		a=10;
		System.out.println("A:"+a);
		System.out.println("Defautl Constructor invoked");
	}
}