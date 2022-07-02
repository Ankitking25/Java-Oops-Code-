public class java132
{
	public static void main(String args[])
	{
		person p1 = new person();
		p1.name="avinash";
		p1.age=18;
		p1.address = "Noida";
		System.out.println("name is ");
		p1.walk(10,20);
		
		
	}
}

class person
{
	String name;
	int age;
	String address;
	void walk(int step,int a)
	{
		System.out.println("name is "+step+"a is "+a);
	}
}