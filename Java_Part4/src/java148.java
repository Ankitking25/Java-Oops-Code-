//Order of most priority is important
public class java148 
{
   public static void main(String args[])
   {
	   try{
			  int a =100/2;
			  System.out.println("A:"+a);
			  int arr[] = new int[5];
			  arr[8]=8;
			  System.out.println("Arr[4] = "+arr[4]);
			  String st = "Geekyshows";
			  System.out.println(st.length());
			  }
	      //Two exception are together
		  catch(ArithmeticException  | ArrayIndexOutOfBoundsException e)  //It has more priority then <Exception> because we specified it as <ArithmeticException>
		  {
			  System.out.println("Not possible");
		  }
		
		  catch(Exception e)  //less priority because above as a more specific
		  {
			  System.out.println("Exception occurs");
		  }
	  
   }
}
