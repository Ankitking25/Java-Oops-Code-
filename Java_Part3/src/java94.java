//static keyword with fianl keyword

class java94
{
	public static void main(String args)
	{
		Geek obj = new Geek();
		System.out.println("Roll no = "+obj.roll);
	}
}
class Geek
{
	static final int roll;
	static{                  //there is no use of method in place of static 
		roll = 100;
	}
}