//Give a parameterized value to a constructor and called it direct without calling any object
class java120
{
	public static void main(String asgs[])
	{
		 Yelloow obj = new Yelloow();
	}
}
class Bluue    //super class
{
	Bluue(int x)   //parameterized constructor
	{
		int a =x;
		System.out.println("Super class constructor a"+a);
	}
}
class Yelloow extends Bluue    //sub class
{
	Yelloow()      //default Constructor
	{
		//remember that only one super and at top we use
		super(100);  //Initailzed the its value  /Also super method call the super class
		int b=200;
		System.out.println("Sub class constructor b = "+b);
	}
}