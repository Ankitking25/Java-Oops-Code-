//Final keyword 
//final keyword use for following purpose
//1.making constants
//2.Preventing method to be overridden
//3.Preventing a class to be inherited

//the final keyword is a way of making a variable as read-only . Its value is set 
//once and then cannot be changed.
/*syntax :- final int roll = 101; */
//we cannot initialize by object making a final keyword
//final int roll = 101;   know its ok
// But final int roll;   //we can initialize the using constructor.We can not initialize this using object or method;


class java91
{
	public static void main(String args[])
	{
		 Game obj = new Game();
		 System.out.println("Roll = "+obj.roll);
	}
}
class Game
{
	final int roll=101;    //final keyword much better in second example
}