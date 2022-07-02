/*Instance Method with parameter*/
//learn syntax 
class java33
{
	public static void main (String args[])
	{
		java33 obj = new java33(); //Creating an object
		obj.disp(10, 20);  //Calling instance method passing value
		System.out.println("First");
		
		
	}
	void disp(int a,int b)  //instance method
	//void method mean Nothing is writing
	{
		int x=a; //local variable
		int y=b; //local variable
		int z=x+y; //local variable
		System.out.println(z);
	}
}

