import java.util.Scanner;

public class selectio {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int z = 0; z < n; z++)
            arr[z] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int minnumber = i;
            for (int y = i + 1; y < n; y++)
                if (arr[y] < arr[minnumber])
                    minnumber = y;

            // swap(arr[minnumber], arr[i]);
            int temp = arr[minnumber];
            arr[minnumber] = arr[i];
            arr[i] = temp;
        }

        for (int q = 0; q < n; q++)
            System.out.print(arr[q] + " ");

    }
}
