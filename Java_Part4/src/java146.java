
public class java146
{
  public static void main(String args[])
  {
	  try
	  {
		  int a=100/2;
		  System.out.println("A:"+a);
		  int arr[]=new int[5];
		  arr[8]=8;
		  System.out.println("arr[4] = "+arr[4]);
		  String st = "Geekyshows";
		  System.out.println(st.length());
	  }
	  catch(Exception e)    //note that there is not any error or exception of type <Exception> class
	  //Exception it handle all type of exception 
	  {
		  System.out.println("Not possible");
	  }
  }
}
