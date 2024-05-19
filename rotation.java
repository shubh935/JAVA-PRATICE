import java.util.Scanner;

public class rotation {
    public static void main(String args[]) {
        System.out.print("enter d ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int arr[] = new int[5];
        int res;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= d; i++) {
            res = arr[0];
            for (int y = 1; y < 5; y++) {
                arr[y - 1] = arr[y];
            }

            arr[4] = arr[0];
        }

        for (int z= 0; z < 5; z++) {
            System.out.print(arr[z] + " ");
        }

    }
}
