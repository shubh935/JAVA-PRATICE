 import java.util.Scanner;
public class s_pattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    //System.out.print("Enter row_size ");
    //int row_size = sc.nextInt();
    //System.out.print("Enter col_size ");
    //int col_size = sc.nextInt();
      
      for (int row = 1; row <= 5; row++) {
          int k = 1;
          for (int col = 1; col <= 9; col++) {
              if( col >=6-row  && col <= 4 + row && k==1 ) 
              {
                System.out.print("*");
                  k=0;
             }   
              else
                 System.out.print("");
                k=1;
          }
          System.out.print("\n");
      }
  }
} 
    

