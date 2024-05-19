import java.util.Scanner;

public class n_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row_size ");
        int row_size =sc.nextInt();
         System.out.print("Enter col_size ");
         int col_size = sc.nextInt();
 
        for(int row = 1; row<=row_size; row++)
        {
            for(int col =1; col<=col_size; col++)
            {
            
                System.out.print((row_size-col+1)  + " ");
        
            }
            System.out.print("\n");
        }
    }
    
}
