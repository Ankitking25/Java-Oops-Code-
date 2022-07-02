//copy of instance varible and accsess as object by class in mehtod or we say in function;--

class java28
{
	public static void main (String args[])
	{
		Game obj = new Game();
		Game obj1 = new Game(); //Same class(Game) object with different name as obj1;
		obj1.mark = 300;  //Local variable
		obj1.roll = 20;  //Local variable
		obj.mark = 200;
		System.out.println("obj1 mark = "+obj1.mark);
		System.out.println("obj1 roll = "+obj.roll);
		System.out.println("obj roll = "+obj.roll);
		System.out.println("obj mark = "+obj.mark);
	}
}
//obj and obj1 have means that they are make a different copy for same class:--

class Game{
	int roll=10; //instance variable
	int mark;  //instance variable
}