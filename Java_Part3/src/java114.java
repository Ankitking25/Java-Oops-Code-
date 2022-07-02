//How a Subclass can hide Variable of super class in java Programming
//Super keyword
/*1.super --> is used to refer immediate parent class instance method
 2.super-->is used to invoke immediate parent class method
 3.super() ---> is used to invoke immediate parent class constructor.
 --Default Constructor , super()
 --Parameterized Constructor , Super(Parameter-list)
  */

//how a subclass hide the variable of the super class

class java114
{
	public static void main(String args[])
	{
		Fup obj = new Fup();
		obj.disp();
	}
}
class Fun    //super class
{
	int a=100;   //instance variable
	
}
class Fup extends Fun
{
	int a =200;   //instance variable
	void disp()   //method
	{
		System.out.println("Value of A = "+a);  //which a is print ,mean super class variable a=100 is not print
		System.out.println("Value of A = "+a); 
	}
}
//So the main reason of use of super keyword is the 
//suppose we required to print the value of a=100 but the control print the a=200 wali value 
//So in that case we use super keyword for print the value of a=100;