import java.util.Scanner;

public class diagonal_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int row = 0;
        int col = 0;

        while (col > 4) {
            col++;
            while (col >= 0) {

                System.out.print(arr[row][col] + " ");
                row++;
                col--;
            }
            ;

        }
        row = 1;
        System.out.println();
        while (row < 5) {
            System.out.println(arr[]);
            
        }

    }
}
