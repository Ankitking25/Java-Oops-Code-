//making of class with a final keyword 
//use to final keyword in class to stop Inheritance
//We can not inherit a final class

class java98
{
	public static void main(String args[])
	{
		 Spider1 obj = new Spider1();
		 Spider2 obj2 = new Spider2();
		 obj.disp();
		 obj2.add();
	}
	
}
class Spider1   //---->we use like that --> final class Spider1 --then we cannot make that sub class
{
	int a = 100;
	void disp() 
	{
		System.out.println("Super class Father");
	}
}
class Spider2 extends Spider1
{
  int b = 200;
  void add()
  {
	  int sum = a+b;
	  System.out.println("Sum = "+sum);
  }
}