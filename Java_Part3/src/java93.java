/*final keyword with  static varibale/class variable*/

class java93
{
	public static void main(String args[])
	{
        Geek obj = new Geek();
        System.out.println("Roll no  =  "+obj.roll);
	}
}
class Geek
{
	static final int roll = 101;   //much better in second example
}