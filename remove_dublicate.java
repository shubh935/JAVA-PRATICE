import java.util.Scanner;

public class remove_dublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter the size of aaray" );
        int n = sc.nextInt();
        int []arr = new int[n];
        int note = 0;
        int index = 0;

        for(int z = 0; z<n; z++)
        {
            arr[z] = sc.nextInt();
        }
        for(int i = 0;i <n; i++)
        {
            if(note!=arr[i])
            {
                arr[index] = arr[i];
                index++;
                note = arr[i];
            }
        }

        for(int y = 0; y<index;y++)
        {
            System.out.print(arr[y]+ " ");
        }
    }
    
}
