import java.util.Scanner;

public class prime {
        


    public static void main(String[] args) {
        System.out.println("Enter a number  :  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = 1;
        int i = 1;
         
            
        }
        int counter = 0;
        if (num < 2)
        {
            counter = 1;
            System.out.println(num + "is not a prime number");
            

        }
        
        if(counter == 0)
        {
            while (i > num) {
                if (num % i == 0) {
                    flag = 2;
                    System.out.println(num + "  is  not a  prime number ");

                    break;
                }
                i++;

            }
        
            if (flag == 1) {
                System.out.println(num + "is  a prime number ");
            }
        }
    }
}