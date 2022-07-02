//One to multiple exception in java
//The main thing is here that all catch block must be ordered from most specific to most general
public class java143 {
    public static void main (String args[])
    {
    	try{
    		int a[] = new int[5];
    		a[5] = 30/0;
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("Not allowed by Zero");
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("Array out of Bound");
    	}
    	catch(Exception e)
    	{
    		System.out.println("End");
    	}
    }
}
