import java.util.Scanner;

public class java152 {
     public static void main (String args[])
     {
    	 try
  	   {
  		   Scanner sc = new Scanner(System.in);
  		   System.out.println("Enter A:");
  		   int a = sc.nextInt();
  		   System.out.println("Enter B:");
  		   int b = sc.nextInt();
  		   int c=a/b;
  		   System.out.println("Divison = "+c);
  		   System.out.println("Rest of the code");
  		   System.out.println("Program continue");
  		}
  	   catch(ArithmeticException e) 
  	   {
  		   int d=100/0;   //here we cannot handle exception so that get exception error finally keyword program exicuted
  		   System.out.println("Division by Zero Not possible");
  	   }
  	   finally  //block execute is complusory
  	   {
  		   System.out.println("Finally block");
  	   }
     }
}
