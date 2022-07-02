//what is method or we say funtion in java:--
//Instance method or static_method/class_method:-

//Instance method
//Instance method without parameter:

class java32
{
	public static void main (String args[])
	{
		java32 obj = new java32();  //Creating an object for calling and disp() object
		obj.disp(); //calling instance method
		System.out.println("first program");
	}
	void disp()
	{
		int a =10;  //local variable
		System.out.println(a);
	}
}


