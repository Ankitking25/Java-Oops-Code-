//Interface
//Is not for run just for initialize the interface
class java103
{
	//
}
interface Father
{
	public static final int mark = 101;
	int roll = 102;
	public void disp();
	int add(int x, int y);
}
interface Mother
{
	int a = 103;
	void ab();
}
interface Son extends Father,Mother
{
	int attendance = 75;
	void putdata();
}