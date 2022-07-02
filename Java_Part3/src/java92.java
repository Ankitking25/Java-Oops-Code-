//final keyword
class java92
{
	public static void main(String args[])
	{
		Geek obj = new Geek();
		
		//not use this  obj.roll=102;
		System.out.println("Roll = "+obj.roll);
	}
}
class Geek
{
	final int roll;   //here we not initailize the roll ;
	Geek()   //constructor
	{
		roll=101;  //You can use the value but not change the value;
	}
}