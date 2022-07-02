//Hybrid Inheritance
class java112
{
	public static void main (String args[])
	{
		Result obj = new Result();
		obj.disp();
	}
}
class Student    //Super Class
{
	int roll = 101;
	int practical = 50;
}
class Exam extends Student    //Subclass
{
	int theory = 100;
	int pm = theory + practical;
	
}
interface Project    //Interface
{
	int pmark = 200;      //public static final  not an instance Variable
	void disp();           //abstract method
}
class Result extends Exam implements Project   //
{
	int sum = pm + Project.pmark;
	public void disp()
	{
		System.out.println("Roll = "+roll);
		System.out.println("Theory = "+theory);
		System.out.println("Practical = "+practical);
		System.out.println("Projecet = "+Project.pmark);
		System.out.println("Total Marks = "+sum);
	}
	
}