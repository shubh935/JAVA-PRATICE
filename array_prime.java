import java.util.Scanner;

public class array_prime {
    public static void main(String[] args) {
        System.out.println("Enter range  ");
        Scanner sc = new Scanner(System.in);
        int a[]= new int[5];
        int r;
        
       
       
       
        for(int p = 0 ; p<5 ; p++)
        {
            a[p] = sc.nextInt();
        }
            for(int q = 0; q<5; q++)
            {
                
                for(r = 2; r<=q; r++)
                {
                    if (a[q]%r==0) 
                        break;
                
                if(a[q] == r)
                System.out.println(q);   
                }
            }
    }
}