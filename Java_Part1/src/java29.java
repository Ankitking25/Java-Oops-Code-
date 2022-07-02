//Static variable or class variable:-
//static variable is make by static keyword:
class java29
{
	public static void main (String args[])
	{
		Test.mark =100;
		System.out.println("Roll = "+Test.roll);
		System.out.println("Marks = "+Test.mark);
		
	}
	//remember it is a static variable so we use +Test.roll means call with class
	//not with object but we also call with object by making an object 
	//But in general static call with class name like here Test.roll class=Test
}


class Test
{
	static int roll = 10;   //Static variable
	static int mark;       //Static variable
}












