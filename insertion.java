import java.util.Scanner;
public class insertion {

    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int y;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int z = 0; z < n; z++)
            arr[z] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
    
            for (y = i; y >= 0; y--) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                } //else
                  //  break;
            }
        }

              for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    

    }
    }