import java.util.Scanner;

public class union {
   public static void main(String[] args) {
    int arr1[5] = new int[]{1,2,3,1,2};
    int arr2[5] = new int[]{2,3,3,4,5};
    int ans[] = new int[5];
    int k =0;

    int i = 0;
    int j = 0;
    while (i<5 && j<5) {
        while (j<5) 
        {
        if(arr[i]==arr2[i])
        {
            ans[k] = ans[i];
            k++;
        }
        j++;
        
    }


   }    
}
