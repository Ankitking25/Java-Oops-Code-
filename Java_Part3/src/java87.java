/*Hierarchical Inheritance*/
//Logic 
//father
//  |      |            |
//  |      |            |
//  |      |            |
//  |      |            |
// Son1    Daughter    Son2    //all use father class property

class java87
{
	public static void main(String args)
	{
		Son objs = new Son();
		Daughter objd = new Daughter();
		objs.getdata(10, 20);
		objs.disp();
		objd.getdata(10, 20);
		objd.disp();
	}
}

class Father
{
	int a, b;   //instance variable
	void getdata(int x ,int y)
	{
		a=x;
		b=y;
	}
}
 class Son extends Father    //sub class son
 {
	 int add()   //It is constructor not required to call it,It automatically called
	 {
		 return (a+b);
	 }
	 void disp()
	 {
		 System.out.println("A = "+a);
		 System.out.println("B = "+b);
		 System.out.println("Sum = "+add());
	 }
 }
 
 class Daughter extends Father
 {
	 int mult()   //constructor
	 {
		 return (a*b);
	 }
	 void disp()
	 {
		 System.out.println("A = "+a);
		 System.out.println("B = "+b);
		 System.out.println("Multi = "+mult());
	 }
 }