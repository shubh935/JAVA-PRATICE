import java.util.Scanner;

public class fibbonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        
      
      //   0 1 1 2 3 5 8 13
        int first_number = 0;
         int second_number = 1;
        for(int i =3 ; i<num;i++)
        {
            
            
            int current_number = first_number + second_number;
            first_number = second_number;
            second_number = current_number;
            if (flag == 1)
            System.out.println("0");
            System.out.println(current_number + "  ");
             
             

        }
    }
    
}
