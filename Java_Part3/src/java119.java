//Super with Default Constructor in java
//first default constructor in java
/*1.Use super() is subclass to initialize superclass default constructor
 2.super() is optional in subclass
 3.super() should be first statement.
 */
class java119
{
	public static void main(String args[])
	{
		Blue obj = new Blue();
		//imp here we cannot call any obj of blue or or pink like obj.blue and in blue class there is no any method only constructor name blue
	}
}
class Pink   //super class
{
    Pink()    //Default constructor
    {
    	int a = 100;
    	System.out.println("Super class constructor a = "+a);
    }
}
class Blue extends Pink  //subclass 
{
	Blue()   //default constructor,imp that constructor automatically call the Pink class method or constructor 
	          //how we is can do by Blue constructor 
	{
		//super();    //super keyword Present by default here so it can call Super class constructor Pink super(); keyword is also Present by default in compiler
		int b=200;
		System.out.println("Sub class constructor b = "+b);
	}
}