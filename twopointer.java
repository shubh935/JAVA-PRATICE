import java.util.Scanner;

public class twopointer {
    public static void main(String[] args) {
        int []arr = new int[]{5,6,8,9,55};
        int start = 0;
        int end = 4;


        while(start<end)
        {
            if(arr[start] + arr[end] == 14)
            {
                System.out.println(arr[start] + " " + arr[end]);
                
                return 0;
                
                
            }
            else if (arr[start] + arr[end] <14) 
            {
                start++;
            }
            else
                    end--;
                
        }
    }
}
    

