//Finally block
/*Finally block is a block that is used to execute important code such as closing file etc.
 *Finally block is always execute whether exception is handled or not.
 *Finally block is should be last block of execution in the program.
 *At least one block either catch or finally,must be associated with each try block.In case you
 *have Both catch block and a finally block with the same try block, you must put the finally block after
 *all the catch blocks.
 *For each try block there can be zero or more catch blocks,but only one finally block.
 *The finally block will not be executed if program exits(either by calling System.exit() ro by
 *causing a fatal error that causes the process to abort).
 *syntax
 *try
 *{
 *   
 *}
 *finally
 *{
 *
 *}
 */
import java.util.Scanner;
public class java151 {
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
	   catch(ArithmeticException e) //Let if we use NullPointerException in place of ArithmeticException the 
	   //program get an error because exceptino handling is done with the same time of excepiton like 
	   //Agar arithmetic error hai to ArithmeticException hei use karo
	   {
		   System.out.println("Division by Zero Not possible");
	   }
	   finally  //block execute is complusory
	   {
		   System.out.println("Finally block");
	   }
	   System.out.println("After finally");
   }
}

