/*Parameterized Constructor*/
//The constructor that can take the argument are called parameterized Constructor

class java82
{ 
	public static void main(String args[])
	{
		Vak obj = new Vak(10,20);
		//here not required any like obj.Vak because Vak is constructor
	}
}

class Vak
{
	int x,y;   //instance variable
	Vak(int a, int b)   //parameterized constructor
	{
		x=a;
		y=b;
		System.out.println("X:"+x);
		System.out.println("Y :"+y);
		System.out.println("Parameterized Constructor invoked");
	}
}

