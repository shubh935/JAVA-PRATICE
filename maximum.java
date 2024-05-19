import java.util.Scanner;

public class maximum {
     public static void main(String[] args) {
         System.out.print("Enter 5 number   = ");
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int min = 5;
        for(int i = 0; i<5;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i<5; i++)
        {
        
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);

     }    
}
