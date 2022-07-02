/* Single Inheritance in java*/
//If a class is derived from one base class(Super class) , it is called Single inheritance*/

//Syntax;

/*Access modifier class Father
  {
     member of class Father                      //super class
  };
  Access modifier class Son extends Father
  {
      member of class son                       //sub class
  }
*/

class java85
{
	public static void main(String args[])
	{
		Son obj = new Son();
		obj.getdata(10, 20);    //calling method of super class , getdata method is also present in son class due to extend keyword;
		obj.disp();        //calling method of sub class
		
	}
}

class Father                     //super class
{
	int a, b ;                    //instance variable
	void getdata(int x ,int y)    //method with parameter
	{
		a=x;
		b=y;
		
	}
}

class Son extends Father     //sub class
{
	int add()    //method
	{
		int sum=a+b;    //a,b Inheritance with Father class 
		return sum;
	}
	void disp()    //method
	{
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("Sum :"+add());
	}
}