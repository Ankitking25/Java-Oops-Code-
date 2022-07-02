/*More then one interface and method in interface */
class java106
{
	public static void main(String args[])
	{
		Chum obj = new Chum();
		obj.disp();
		obj.add();
	}
}
interface Gun
{
	int mark=100;
	void disp();
}
interface Gum
{
	int mark_1 = 200;
	void add();
}
class Chum implements Gun,Gum
{
	int sum = Gun.mark + Gum.mark_1;
	public void disp()  //Method defined here as a Gun interface
	{
		System.out.println("Roll = "+Gun.mark);
	}
	public void add()
	{
		System.out.println("Total marks = "+sum);
	}
}