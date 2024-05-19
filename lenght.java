import java.util.Scanner;
public class lenght
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("enter number :  ");
        int num = sc.nextInt();
        int digit = 1;
        int n = 10;
        for(int i =1; i>=1; i++)
        {
            if(num/n==0)
            {
                System.out.print(digit);
                break;
            }
            n = n * 10;
            digit++;
        }
        
    }
}