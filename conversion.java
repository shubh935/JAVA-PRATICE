import java.util.Scanner;

//public class conversion {
   
   
   
//   // decimal to binary conversion
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter a number ");
//       int num = sc.nextInt();
//       int sum = 0;
//       int base = 1;
//       //  int sum2 = 0;
//       while (num > 0) {
//           int rem = num % 2;
//           sum = (sum + rem * base);
//           num = num / 2;
//           base = base * 10;
//       }
//       System.out.println(sum);
//
//   }
//
//
//
public class conversion
{
    

    
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter a number ");
           int num = sc.nextInt();

           int sum = 0;
           int base = 1;
           
           int rem;

           while (num>0) {
            rem = num % 10;
            sum = sum + rem * base;
            num = num / 10;
            base  = base * 2;
            
           }
           System.out.println(sum);
    }
}