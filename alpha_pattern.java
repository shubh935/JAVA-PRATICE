 import java.util.Scanner;


public class alpha_pattern {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter row_size ");
            int row_size =sc.nextInt();
            System.out.print("Enter col_size ");
            int col_size = sc.nextInt();
            char ch = 'A';
            for(int row= 1; row<=row_size; row++)
            {
               
                  
                for(int col = 1; col<=col_size; col++)
                {
                    if (col >= 1 && col <= row)
                    {
                        System.out.print(ch + " ");
                        ch++;
                    }
            }
                System.out.print("\n");
                
            }
    

        }
} 
    

