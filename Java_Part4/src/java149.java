
public class java149 {
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
		 //--> catch(ArithmeticException  | ArrayIndexOutOfBoundsException | Exception e) //why error is here 
    	 //because <Exception> exception  is a super class and <ArithmeticException> exception and <ArrayIndexOutOfBoundsException> exception is a subclass or child class
    	 //always remember that we cannot use parent class and child class exception together
		  {
			  System.out.println("Not possible");
		  }
		
    }
}
