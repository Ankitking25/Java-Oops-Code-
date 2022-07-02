/*Multiple Inheritance achieve using interface in Java   */
class java110
{
	public static void main(String args[])
	{
		Chuum obj = new Chuum();
		obj.disp();
	}
}
class Guun          //super class
{
	int a =10;         //Instance Variable
	int add(int y) //method
	{
		int b =y;    //local variable
		return (a+b);
	}
}
interface Guum      //Interface
{
	int c=30;      //public static final
	void disp();   //Abstract Method
}
class Chuum extends Guun implements Guum   //extends and implements together
{
	int m = a*Guum.c;    //accessing class interface Variable
    int sum=add(20);   //calling method and assign is in the sum variable
	public void disp()   //Defining Interface abstract method
	{
		System.out.println("Addition ="+sum);
		System.out.println("Multiplication ="+m);
	}
}