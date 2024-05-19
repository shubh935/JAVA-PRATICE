import java.util.Arrays;
public class execption {

    public static void main(String[] args) {

        //default throw our catch
     /*     try
      {
       //try block me exception code likhi jati hain
       //exception code k baad wali code try block ki ecxecut nhi hoti hai;
       System.out.println(5/0);
     System.out.print("hello");
      }
      
       catch(ArithmeticException s)
       {
      System.out.println("koe baat nhi execpyion aay atho");
      System.out.println("hsbjhdvgj");
       }
      
       System.out.println("exception ki baad ki code");
       
       final
       {
     System.out.println(5/0);
       }
     */


/*     
    //our throw default catch

       int balance = 5000;
       int withdrawAmount = 6000;

       if(withdrawAmount>balance)
       throw  new ArithmeticException();

     System.out.println("transaction unsussesful"); //exception k baad wali code execute nhi hoti ahin
       
*/



   //our throw our catch
   try
   {
    if(withdrawAmount>balance)
        throw new ArithmeticException("transaction unsessfull");
    balance = balance - withdrawAmount;
    System.out.println(balance);
   }

   catch(ArithmeticException e)
   {
    System.out.println("Exceptio :  "+ e.getMessage() );
   }
   System.out.println("program continue ");
    
}
}