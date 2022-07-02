/*Super with method */
//How a subclass can hide method of a super class?
class java116
{
	public static void main(String args[])
	{
		Red obj = new Red();
		obj.put();
	}
}
class Yellow    //super class
{
	int a=100;   //instance class
	void put()   //super class method
	{
		System.out.println("Super class a ="+a);  //that method can get hide due to same class of method put
	}
}
class Red extends Yellow  //sub class
{
	int b=200;  //instance variable
	void put()   //sub class method
	{
		System.out.println("Sub class b = "+b);
	}
}
//In output the super class Yellow -->System.out.println("Super class a ="+a);  is not get an output.
//It get hide because of same method we call by obj.put so first subclass get an output and hide a super class method