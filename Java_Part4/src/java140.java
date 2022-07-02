
class java140
{
	public static void main (String args[])
	{
		try{
		int a=20;
		int v=5;
		float c=a/v;
		int k=0;
		float l=k/0;
		System.out.println("the program is start form here");
		System.out.println("The division is = "+c);   //why these code not get an output on screen.
		//always remember that to make a try block short see same code on next java141.
		System.out.println("The exception is found here by value is = "+l);  //exception is start from here
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not possible");
		}
		System.out.println("the program is finished");
	}  
}