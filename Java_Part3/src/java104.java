//Interface in java
class java104
{
	public static void main(String args[])
	{
		Son obj = new  Son();
		obj.disp();
	}
}
interface Father
{
	public static final int mark = 100;
	int roll = 121;
	void disp();  //like abstract ,Here declared the method 
}
class Son implements Father
{
	int mark1 = 200;
	int sum = Father.mark + mark1;
	public void disp()  //here initailized the void that define in the void disp()
	{
		System.out.println("Roll = "+Father.roll);
		System.out.println("Roll no = "+sum);
	}
}
