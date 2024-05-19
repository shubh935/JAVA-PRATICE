import java.util.Scanner;

public class missing_element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array ");
        int size = sc.nextInt();
        int sum = 0;
        int[] a = new int[size];
        for (int y = 0; y < size; y++) {
            a[y] = sc.nextInt();
        }
        int total = size*(size + 1) / 2;
        for (int i = 0; i < size; i++) {
            sum = sum + a[i];
        }

        System.out.print(total - sum);
    }
}