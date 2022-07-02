//Two Array in Java
class java61
{
	public static void main (String args[])
	{
		int num[][];
		num = new int[3][4];
		int a = num.length;
		num[0][0]=11;  //Row1
		num[0][1]=22;
		num[0][2]=33;
		num[0][3]=44;
		
		num[1][0]=55; //Row2
		num[1][1]=66;
		num[1][2]=77;
		num[1][3]=88;
		
		num[2][0]=99; //Row3
		num[2][1]=110;
		num[2][2]=120;
		num[2][3]=130;
		
		System.out.println("Num[0][1] = "+num[0][1]);
		System.out.println("Num[1][2] = "+num[1][2]);
		System.out.println("the lenght of the num = "+num.length);
		
	}
}
