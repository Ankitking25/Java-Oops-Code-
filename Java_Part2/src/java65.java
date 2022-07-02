/*Calculation with 2D array in Java*/

import  java.util.Scanner;
class java65
{
	public static void main (String arg[])
	{
		int num[][] = new int[3][4];
		num[0][0] = 11;
		num[0][1] = 22;
		num[0][2] = 33;
		num[0][3] = 44;
		
		num[1][0] = num[0][1] + num[0][2]; 
		num[1][1] = num[0][0] + 60;
		num[1][2] = 77;
		num[1][3] = 88;
		
		num[2][0] = 99;
		num[2][1] =100;
		num[2][2] = 110;
		num[2][3] = 120;
		
		System.out.println("num[0][1] = "+num[0][1]);
		System.out.println("num[1][0] = "+num[1][0]);
		System.out.println("num[1][2] = "+num[1][1]);
		
	}
}


