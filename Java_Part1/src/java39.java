//Method overloading in term of type of parameter in java:--
class java39
{
	public static void main(String args[])
	{
		Addition obj = new Addition();
		//how I know the order mean at what disp control go first;
		//There is no fixed order it just check the data type;
		obj.disp(10,20);
		obj.disp(5,12.0f);
	}
}

class Addition
 {
	void disp(int a , int b)  //Instance Method with parameter
	{
		int x = a , y = b;
		int z = x+y;
		System.out.println("Additon = "+z);
	}
	void disp(int a, float b)  //Instance method with parameter but with different parameter
	{
		int x = a;
		float y = b;
		float z=x*y;
		System.out.println("Multiplication = "+z);
	}
 }

//there is two different disp method it is not same because of data type inside it
//like in first both are int a and int b and in second int a and float b;