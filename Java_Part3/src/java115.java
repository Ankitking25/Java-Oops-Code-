//Super keyword 
//IN previous we learn how that "How a subclass can hide the variable of super class"
//Now how we overcome this

class java115
{
	public static void main(String args[])
	{
		Fuup obj = new Fuup();
		obj.disp();
	}
}
class Fuun    //super class
{
	int a=100;   //instance variable
	int b;
	
}
class Fuup extends Fuun
{
	int a =200;   //instance variable
	int c=super.b=300;
	void disp()   //method
	{
		System.out.println("Value of super class A = "+super.a); //by that we use the super variable
		System.out.println("Value of A = "+a); 
		System.out.println("Value of c Super is "+super.b);
		System.out.println("Value of c Super is "+c);
	}
}