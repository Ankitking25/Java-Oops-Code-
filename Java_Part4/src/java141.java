
class java141
{
	public static void main (String args[])
	{
		
		int a=20;
		int v=5;
		float c=a/v;
		int k=0;
		try{
	    float l=k/0;  //imp remember that exception is start from here 
	    //so float give an Exception value so from here l the exception get Start so make it in a try block 
	    //Or that the reason of in previous code why not not execute
	    //Always remember that the below of exception the code is not executed.
		System.out.println("the program is start form here");
		System.out.println("The division is = "+c);  
		
		System.out.println("The exception is found here by value is = ");  //exception is start from here
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not possible");
		}
		System.out.println("the program is finished");
	}  
}
