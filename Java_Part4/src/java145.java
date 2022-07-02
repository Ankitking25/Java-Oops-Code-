/*In java 1.6 there is no feature for making a catch exception for same type of exception by making a same handling code  */
//But in java 1.7 for same handling code we can make multiple exception handling code in same catch block like in below with the symbol:- | .
//Rule is also follow from most specific to most general is here

public class java145
{
	public static void main(String arg[])
	{
		try
		{
			int a = 100/0;   //arithmetic Exception
			System.out.println("A:"+a);
			int arr[]=new int[5];
			arr[8]=8;  //Creating exception
			System.out.println("Arr[4] = "+arr[4]);
			String st = "";    
			System.out.println(st.length());   //Creating an Exception is here
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Not possible array");
		}
		catch(NullPointerException e)
		{
			System.out.println("Don't input Null");
		}
		
	}//Exception is always with Order
}