/*Accessing interface Variable in java*/
//Mean a variable that is in interface method --> how we use in program or how we call it

class java107
{
	public static void main(String args[])
	{
		Chum obj = new Chum();
		obj.add();
		obj.disp();
	}
}
interface Gun
{
	int mark=100;
	void disp();
}
interface Gum
{
	int mark = 200;
	void add();
	
}
class Chum implements Gum, Gun
{
	public void disp()
	{
		System.out.println("Mark one = "+Gun.mark);  //Gun.mark mean Gun interface ka mark
	}
	public void add()
	{
		System.out.println("Mark two = "+Gum.mark);  //Gum.mark mean Gum interface ka mark
	}
}