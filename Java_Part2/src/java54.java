/*Initialization an Array with an Array;*/
class java54
{
	public static void main(String args[])
	{
		int num[] = {11,22,33,44,55};
		int mark[];
		mark = num;   //initialization the value of num in mark;
		for(int i=0;i<5;i++)
		{
			System.out.println(mark[i]);
		}
	}
}
