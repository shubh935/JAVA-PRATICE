import java.util.Scanner;

class leftmost
{
    public static void main(String[] args) {
        int []arr = new int{11,22,33,44,55};

        int mid;
        int start = 0;
        int last =  4;
        int target = 25;
        int R_target = 55;
        int leftindex;

        while(start<=last)
        {
            mid = start + last;

            if(arr[mid]==target)
            {
               leftindex = mid;
               last = mid - 1;
            }

            else if (arr[mid]>target) 
            {
                last = mid - 1;

            }
            else
            {
                start = mid + 1;
            }
                
         }

          //  for rightmost;

          start = 0;
          last = 4;
          int mid = 0;
          int rightindex;

          while(start<=last)
          {
            mid = (start + last) / 2;

            if(arr[mid] == targetR)
            {
                rightindex = mid;
                start = mid + 1;
            }

            else if(arr[mid]<R_target)
            {
                start = mid + 1;

            }

            else
            {
                last = last -1;
            }
          }
    }
}