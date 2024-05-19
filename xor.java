import java.util.Scanner;

public class xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul = 1;
        int rem;
        int sum = 0;
        while (num > 0) {
            rem = num % 10;

            if (rem == 0)
                rem = 1;
            else
                rem = 0;

            sum = sum + rem * mul;
            num = num / 10;
            mul  = mul * 10;

        }
        System.out.println(sum);
        

    }
    
}
