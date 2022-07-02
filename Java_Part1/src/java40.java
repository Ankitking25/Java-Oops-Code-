//Method overloading in java In term_of parameter:-
//always remainber that such a difference in both method in data type or number
 
public class java40
{
	public static void main (String args[])
	{
		Test obj = new Test();
		obj.disp(23,42);
		obj.disp(12);
		
	}
}


class Test
{
	void disp(int a)
	{
		int x=a;
		System.out.println("Value fo A = "+a);
		
	}
	void disp(int a, int b)  //Instance method
	{
		int x=a;
		int y=b;
		int z=x*y;
		System.out.println("Multiplication = "+z);
	}
}

