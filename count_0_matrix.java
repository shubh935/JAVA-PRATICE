import java.util.Scanner;

class count_0_matrix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[4][4];

        for(int i =0;i<4; i++)
        {
            for(int j = 1;j<4;j++)
            {
                arr[i][j] = sc.nextInt();

            }
        }
        int row = 0;
        int col = 3;
        int count = 0;

        while(row<4 && col>=0)
        {
            while (col>=0 && arr[row][col]==1) {
                col--;

                count+=col+1;
                row++;
                
            }
        }
        System.out.println(count);
        
    }
}