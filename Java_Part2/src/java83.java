/*There is on Copy in java*/
/*method overloading like same as Constructor overloading*/

/*when more than one constructor is defined in a class , then it is called constructor
 overloading or use of multiple constructor in a class */


//Constructor overloading remember class name or constructor name is same
//Not give the same name or always change a such difference like in parameter data_type same in method overlaoding

class java83
{
	public static void main(String args[])
	{
		Test obj = new Test(10);
		Test obj1 = new Test(20.32f);
		Test obj2 = new Test(10,20);
	}
}

class Test
{
	int x,z,k;   // INstance variable
	float y;   //instance variable
	Test(int a)   //parameterized constructor 
	{
		x=a;
		System.out.println("X:"+x);
		
	}
	Test(float a)   //Same constructor name but different in data as above wala int tha
	{
		y=a;
		System.out.println("Y:"+y);
	}
	Test(int a, int b)  //same constructor but different in number of data type like in method overloading 
	{
		z=a;
		k=b;
		System.out.println("Z:"+z);
		System.out.println("K:"+k);
	}
}
