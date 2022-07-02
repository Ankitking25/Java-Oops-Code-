//program is not run give a simple idea of we use throw keyword 
//It may used in a better way to use and handling the exception or defined exception in java
public class java155 {
   public static void main(String args[])
   {
	   //thorw keyword use in a better way for user defined keyword in java
	   int transferamount=1000; int Balance = 5000;
	   if(transferamount>Balance)
	   {
		   throw new Balancenotavalible("Divison by zero not allowed");
	   }
   }
}
