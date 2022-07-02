//we Can use multiple exception in a use of single try
//mean like only one try and use multiple catch.
/*syntax  
 * try
 * {
 *    ArithmeticException
 *    NullPointerException
 *    IOException 
 *  }  
 *  catch(ArithmeticException e)
 *  {
 *      System.out.println("Not possible");
 *  }
 *  catch(NUllPointerException e)
 *  {
 *      System.out.println("Not possible");
 *  }
 *  catch(IOException e)
 *  {
 *    Sytem.out.println("Something missing");
 *  }
 */
 //All catch blocks must be ordered from most specific to most general
 /*Example
  * try
  * {
  *    int a[]=new int[5];
  *    a[5]=30/0;
  *    
  * }
  * catch(ArithemeticException e)
  * {
  *   System.out.println("Not allowed by zero");
  * }
  * catch(ArrayIndexOutOfBoundsException e)
  * {
  *    System.out.println("Array out of Bounds");
  * }
  * catch(Exception e)
  * {
  *   Sytem.out.println("End"); 
  * }
  */
//Always order from most Specific to most General