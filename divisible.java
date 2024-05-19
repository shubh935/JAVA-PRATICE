import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i++)
        {
            if (i % 5 == 0 && i % 7 == 0)
              
            {
                count++;
                System.out.println(i + " ");
            }

            if (count == 5) {
                break;

            }
        }
        
        System.out.println();
    }
}
