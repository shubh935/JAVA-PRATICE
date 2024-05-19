  import java.util.Scanner;


  public class piramid {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //System.out.print("Enter row_size ");
      //int row_size = sc.nextInt();
      //System.out.print("Enter col_size ");
      //int col_size = sc.nextInt();
        
        for (int row = 1; row <= 4; row++) {
            int k = 1;
            for (int col = 1; col <= 7; col++) {
                if (col >=5- row  && col <= 5 + row) 
                {
                    System.out.print(k);
                    col<4?k++: k--;
            }   
                else
                   System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

  }