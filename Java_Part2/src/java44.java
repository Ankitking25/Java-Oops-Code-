//Calling Static method in Static method
//static method belong to class rather then object
//this and static keyword not use in static method
//first seen the syntax , or we say the nested static method

class java44
{
	public static void main (String args[])
	{
		disp();     //for calling static method in same class there is no need to make object or we call direct
	}
	static void disp()     //making a static method in same class there is no need to make an object
	{
		int x=10;
		System.out.println("Value of A = "+x);
	}
}
