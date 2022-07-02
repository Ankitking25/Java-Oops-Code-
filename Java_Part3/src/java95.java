//final keyword with Local variable

class java95
{
	public static void main(String args[])
	{
		Geeky obj = new Geeky();
		obj.disp();
	}
}
class Geeky
{
	void disp()
	{
		final int roll;  //local variable
		roll = 101;  //Initialize in same block
		//roll = 102;   we cannot use it because roll make with Fianl keyword 
		System.out.println("Roll = "+roll);
	}
}
