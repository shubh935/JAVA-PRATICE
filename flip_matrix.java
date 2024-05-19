import java.util.*;
public class flip_matrix {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
        //   int arr2[][]  = new int[3][3];
        System.out.print("ENter first array element \n");

        int sum[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 2; i >=0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
}
