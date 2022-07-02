//multiple Inheritance 
//not in java
/*If a class is derived from more than one parent class (Super class),then it is called multiple Inheritance.*/

//<Multi-level Inheritance in java>
/*In Multi-level inheritance,the class inherits the feature of another derived class(Sub Class)*/
/* Father -----> Son ------>Grandson*/
/*Super_class->intermediate-->Sub_class*/
//syntax
/* Access modifier class Father
       {
           members of class Father
       };
   Access modifier class Son extends Father
       {
           members of class son
       };
       
   Access modifier class GrandSon extends Son
       {
           members of class GrandSon
       };
*/



class java86
{
	public static void main(String args[])
	{
		Grandson obj = new Grandson();
		obj.getdata(10,20);
		obj.disp();
	}
}

class Father
{
	int a,b;
	void getdata(int x, int y)    //method with parameter
	{
		a=x;
		b=y;
	}
}

class Son extends Father   //extend keyword , intermediate Sub class
{
	int c=30;   //local variable
	int add()
	{
		int sum = a+b+c;
		return sum;
	}
}

class Grandson extends Son    //sub class
{
	void disp()
	{
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		System.out.println("Sum = "+add());
	}
}