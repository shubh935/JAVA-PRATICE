
import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        System.out.println("Enter number ");
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i =0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }
        int num = a[4];
        a[0] = num;

        for(int j =0; j<=3; j++)
        {
            int temp = a[j + 1];
            a[j + 1] = a[j];
            a[j] = temp;
        }
        

         for(int j =0; j<5; j++)
        System.out.print(a[j] + "  ");

    }
    
    
}
