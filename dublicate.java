import java.util.Scanner;
public class repeating {
    public static void main (String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("size");
    int size = sc.nextInt();
    int arr[]= new int[size];
    int  []count= new int[]{0,0,0,0,0};
    for(int i = 0; i<size; i++)
    {
        arr[i] = sc.nextInt;
    }

    for(int y = 0; y<size; y++)
    {
        count[arr[y]]++;
    }
    for(int z = 0; y<size; z++)
    {
        if(count[z]>1)
        Sytem.out.print(z +" ");
    }

    
    
}
}

