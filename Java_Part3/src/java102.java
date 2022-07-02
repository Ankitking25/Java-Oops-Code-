//One interface can be implemented in a single class.
//NOt run program Just defining the interface;-
class java102
{
	public static void main(String args[])
	{
		//Father obj = new Father   //Not making an object in interface
	}
}
public interface Father  //public is use for public access for all method
{
	public static final int mark = 101;  //Remember that all the below are also public by default
	int roll = 102;
	public void disp();
	void putdata();
	int add(int x , int y);
}