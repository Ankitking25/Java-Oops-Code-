//instance variable and calling class instance:--
class java27
{
	public static void main (String args[])
	{
		Test obj = new Test();//remember user input be like same but some difference
		obj.mark =200;
		System.out.println("Roll = "+obj.roll);
		System.out.println("Marks = "+obj.mark);
	}
	//test obj is basically for using class calling
	//but take user input we required
	//import java.util.Scanner;
	//And Test obj =new Test (System.in)
}


class Test
{
	int roll =10;  //instance variable
	int mark;      //instance variable
}