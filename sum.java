import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int[] ab = new int[5];
        int add = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("plz enter a number =   \n");
            ab[i] = sc.nextInt();
            add = add + ab[i];
        }
        System.out.println(add);

    }
}