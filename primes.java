import java.util.Scanner;

public class primes {
    public static void main(String[] args) {
        System.out.println("Enter range  ");
        Scanner sc = new Scanner(System.in);
        int j;
        
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        int sum = 0; 
        for(int i = lower ; i<=upper ; i++)
        {

            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                {
                    
                    break;
                }

            }
            if (i == j)
            {
                sum = sum + i;
                System.out.print(i + " ");
            }

        }
        System.out.println("sum : " + sum);
    }
    
}
