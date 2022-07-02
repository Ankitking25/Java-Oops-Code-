
class java37
{
	public static void main (Strnig args[])
	{
		Test obj = new Test();
		System.out.println("First Name"+obj.fname());
		String lastname = obj.lname("shows");
		System.out.println("Last Name: "+lastname);
	}
}




class Test
{
	String fname() //instance method
	{
		String s = "Geeky";  //local variable
		return s;
		
	}
	String lname(String st); //local variable
	{
		String str = st;  //local variable
		return str;
	}
}