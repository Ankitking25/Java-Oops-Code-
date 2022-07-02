//Nesting of instance method
//ek method ke under ke or method hona

class java38
{
	public static void main (String ars[])
	{
		Game obj = new Game();
		obj.disp();
	}
}


class Game
{
	int add()     //instance method
	{
		int a = 10,b=20;
		int z = a+b;
		return z;
	}
	void disp()  //instance method
	//imp thing here
	//instance method ke under instnace method ke lyia object is not required
	//like here not need to make's object for add() method like GAME obj = new GAME()
		int x = add();   //calling instance method, //inside instance method.
		System.out.println("Addtion = "+x);  
	}
}