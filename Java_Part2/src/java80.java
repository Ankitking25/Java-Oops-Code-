//Default Constructor in Java Programming 
//Constructor in which there is no Parameter called default Constructor 
//if they have a value then all the parameter have default values.
//if there is no constructor in a class , compiler automatically creates a default constructor:

class java80
{
     public static void main(String args[])
 
     {
	    Test obj = new Test();
     }
}
 
class Test
{
	int a;   //Instance Variable
	Test()    //Default Constructor
	{
		a=10;
		System.out.println("A:"+a);
		System.out.println("Default Constructor invoked");
		
	}
}