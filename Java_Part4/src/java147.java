//Most specific to most General type code
//check program by making an different type of exception
public class java147 {
  public static void main(String agrs[])
  {
	  try{
		  int a =100/2;
		  System.out.println("A:"+a);
		  int arr[] = new int[5];
		  arr[4]=8;
		  System.out.println("Arr[4] = "+arr[4]);
		  String st = "Geekyshows";
		  String sd = null;
		  System.out.println(st.length());
		  System.out.println(sd.length());
		  }
	  catch(ArithmeticException e)  //It has more priority then <Exception> because we specified it as <ArithmeticException>
	  {
		  System.out.println("Not possible");
	  }
	  catch(ArrayIndexOutOfBoundsException e)  //It has more priority  then <Exception> because we specified it as <ArrayIndexOfBoundsExcepiton>
	  {
		  System.out.println("Not possible array");
	  }
	  catch(Exception e)  //less priority because above as a more specific
	  {
		  System.out.println("Exception occurs");
	  }
  }
}
