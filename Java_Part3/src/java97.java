//final method
//make with final keyword
/*We cannot override final method in Subclass .We define a method final when we
 are concerned that a subclass may accidentally redefine the method(override)*/
//Simple if we make a method with a final keyword then we cannot use the overriding concept:
//syntax: final void disp() like this

class java97
{
	public static void main (String args[])
	{
		Spider_ obj = new Spider_();
		Spider_1 obj1 = new Spider_1();
		Spider_2 obj2 = new Spider_2();
		obj.disp();
		obj1.disp();
		obj2.disp();
	}
}

class Spider_
{
	void disp()  //method 
	//if we use final void disp()  then we cannot use void disp in below class Spider_1 or Spider_2
	{
		System.out.println("I am main class");   //Super class
	}
}
class Spider_1
{
	void disp()  //not constructor because constructor has same name as class and no need to call it
	{
		System.out.println("I am the Sub interimediate Clsass");
	}
	
}
class Spider_2
{
	void disp()
	{
		System.out.println("I am the sub class");
	}
}