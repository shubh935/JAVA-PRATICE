import java.util.Scanner;

public class pattern {
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter no of row :  ");
      int row = sc.nextInt();
       System.out.print("Enter no of column :  ");
      
      int col = sc.nextInt();
        for( int i= 1 ; i<=row; i++)
        {
            for (int x = 1; x <= col; x++)
            {
                 if(x<=col)
                 System.out.print(" *");
            }
            System.out.println("\n");
        }
    }

}
