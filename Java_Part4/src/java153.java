/*Exception Propagation
 * Inside a method if an exception raised and if you are not handling that exception then excetion object
 * will be propagated to caller then caller method is responsible to handle exception.This pocess is called 
 * Exception Propagation.
 * Syntax,
 * void getdata()
 * {
 *    getdata();
 * }
 * void getdata1()
 * {
 *    getdata2();
 * }
 * void getdata2
 * {
 *    int a = 100/0;
 * }
*/
//Example
//flow of control is important 
class java153
{
	public static void  main (String args[])
	{
		java153 obj = new java153();
		System.out.println("Hello");
		try   //why the try for handling is here not in getdata1 the concept is learn by to understand the flow of control here
		{
		obj.getdata();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled in main method");
		}
		
	}
	void getdata()
	{
		System.out.println("Hello Getdata first");
		
		disp();    //here we cannot make object previous concept
		System.out.println("Hello Getdata");
	}
	void disp()
	{
		System.out.println("Hello Getdata Second");
		int a=100/0;
		System.out.println("A:"+a);
	}
}
