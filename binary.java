import java.util.Scanner;

public class binary {
    
    public static void main(String[] args) {
        //System.out.print("Enter the size of array =  ");
        Scanner sc = new Scanner(System.in);
        int mid;

    
        int[] arr = new int[5];
          for(int z = 0; z<5;z++)
          {
              arr[z] = sc.nextInt();
          }
        
    
        int start = 0;
        int last = 4;
        int target = 37;
        while (start <= last) {
            mid = (start + last) / 2;
            if (target == arr[mid]) 
            {
                System.out.print("Matches");
                break;
            } 
            else if (target < arr[mid])
             {
                last = mid - 1;
            }
             else
                start = mid + 1;
        }
        System.out.println("Not found ");

    }

}
