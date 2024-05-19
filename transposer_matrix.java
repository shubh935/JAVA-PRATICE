import java.util.*;
import java.util.Collections;

public class transposer_matrix {
    public static void main(String[] args) {
        System.out.println("Enter the element ");
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int arr2[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //   for (int i = 0; i < 3; i++) {
        //       for (int j = 0; j < 3; j++) {
        //           System.out.print(arr[j][i] + " ");
        //       }
        //       System.out.println();

        for (int row = 0; row < 2; row++) {
            for (int col = row + 1; col < 3; col++) {
                Collections.swap(vector,arr[row][col], arr[col][row]);
            }
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.println(arr[r][c]);
            }
        }

    }
}
