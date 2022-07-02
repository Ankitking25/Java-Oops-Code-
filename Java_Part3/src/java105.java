/*Good Morning Ankit*/
class java105
{
	public static void main (String args[])
	{
		Spiderman_1 obj = new Spiderman_1();
		obj.disp();
		
	}
}
interface Spiderman
{
	public static final int mark = 100;
	int roll = 120;
	void disp();
}
class Spiderman_1 implements Spiderman
{
	int mark1=200;
	int sum=Spiderman.mark + mark1;
	public void disp()  //always make an public class for interface method
	{
		System.out.println("Roll = "+Spiderman.roll);
		System.out.println("Total marks = "+sum);
	}
}