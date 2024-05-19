import java.util.Scanner;

public class insert_at_k {
    /**
     * @param args
     */
    public static void main(String[] args) {
     int []arr = new int{22,55,77,88,99};

        int target = 33;
        int start = 0;
        int last = 4;
        int mid ;
        
        while(start<=last)
        {
            mid = (start + last) /2;

            if(arr[mid]==target)
            {
                index = mid;
            }

            else if(arr[mid>target])
            {
                end = mid -1;
                index = mid;

            }
            else
            {
                start = mid+1;
                index = mid + 1;
            }

        }
    }
    
}
