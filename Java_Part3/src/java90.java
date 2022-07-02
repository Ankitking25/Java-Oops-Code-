//Abstract method

class java90
{
	public static void main(String args[])
	{
		Kings s = new Kings();
		Kingd d= new Kingd();
		s.disp();   //calling method of Sub class Son
		d.disp();   //Calling method of sub class Daughter
	}
}

abstract class King      //super class , abstract class
{
	abstract void disp();        //abstract method
}

class Kings extends King    //sub class Son
{
	void disp(){
		System.out.println("Abstract method defined in sub class Son");
	}
}
class Kingd extends King    //Sub class Daughter
{
	void disp()   //defined according to rule of abstract method
	{
		System.out.println("Abstract Method defined in sub class Daughter");
		
	}
}






