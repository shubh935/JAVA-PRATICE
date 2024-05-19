import java.util.Scanner;
public class butterfly {
    public static void main(String[] args) {
        for(int row =1; row<=5; row++)
        {
            for(int col=1; col<=9; col++)
            {
                if(col<=row && col>=9-col)
                {
                    System.out.println("*");
                }
                else
                System.out.println(" ");
            }
        }
        
    }
    
}
