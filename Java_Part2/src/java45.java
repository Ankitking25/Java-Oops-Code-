//The way of calling a static method if the method is not in same class of main funtion
class java45
{
	public static void main(String args[])
	{
		//how we call static void method here
		//we also calling with the help of the object making
		Test.disp();  //here there is not making any object like Test obj=new Test(); because it static method we can call directly
	}  //In general for all method calling making an object of that class:--
}    
class Test
{
	static void disp()  //static method
	{ 
		int x=10;    //Local variable
		System.out.println("Value of A = "+x);
	}
}
