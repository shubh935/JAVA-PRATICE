import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i, y, x;

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (y = 0; y < n - 1; y++) {
            for (x = 0; x < (n - 1) - y; x++) {
                if (arr[x] > arr[x + 1]) {
                    int temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;
                }

            }
        }
    }
}

       
       
       
       
       
       
       

       
       
       
       
       
       
       

       
       

       

       

       
       
       
    }
}
