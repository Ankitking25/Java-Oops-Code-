//One to multiple exception in java
//Nothing is Error here so why the program is not execute or run 
//The concept of most specific is not verified here so that the program is not run here
//Means first the exception be like arithmetic-->the Array bounds-->Then end bound
public class java144
{
    public static void main (String args[])
    {
    	try
    	{
    		int a[] = new int[5];
    		a[5] = 30/0;
    	}
    	catch(Exception e)
    	{
    		System.out.println("End");
    	}

    	catch(ArithmeticException e)
    	{
    		System.out.println("Not allowed by Zero");
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("Array out of Bound");
    	}
    }
    	    
}
//Always start from below the exception chat flow
