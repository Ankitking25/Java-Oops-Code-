//In previous we learn method over overloading
//Now Method Overriding         
/*Overriding refers to the ability of a subclass to re-implement an instance method inherited from a superclass */
//Mean overriding is only in case of Inheritance
//method overriding Give a useful impact that to use a method of same name Again
//that method overriding that can inheritance


//Final and static method cannot be overridden
//The overriding method must have same argument list
//the overriding method must have same return type
//constructor cannot be overridden
class java88
{
	public static void main(String args[])
	{
		Suber f = new Suber();
		Suum s = new Suum();
		Doo d = new Doo();
		f.call();
		s.call();
		d.call();
		
	}
}

class Suber
{
	int a = 100;
	void call()   //constructor
	{
		System.out.println("Super class father");
	}
}
//In overloading same class is not Possible there is a difference in some-one 
//In overriding the case of overriding use in Inheritance
class Suum extends Suber
{
	int b = 20;
	void call()       //method overriding 
	{
		int sum=a+b;
		System.out.println("Sub class son");
		System.out.println("Addition = "+sum);
		
	}
}

class Doo extends Suber
{
	int c=20;
	void call()      //method overriding here mean same method name in all program void call;
	{
		int mult = a*c;
		System.out.println("\nSub class Daughter");
		System.out.println("Multiplication = "+mult);
	}
}