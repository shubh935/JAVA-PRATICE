
import java.util.Scanner;

public class sorting {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int[] unsorted_array = new int[26];
        int[] count = new count[26];
        for(int i =0; i<26; i++)
            unsorted_array[i] = sc.nextInt();

        for(int i = 0;i<26;i++)
            count[i] = 0;
            
        for(int i =0; i<26; i++)
        {
            int index = unsorted_array[i] - 'a';
            count[i] = index;
            count[index]++;
        }
        
        for(int i = 0; i<26; i++)
        {
            for(int j=0; j<=count[i]; j++)
            {
                char ch = i + 'a'
                System.out.print(ch + " ");
            }
        }
    }
    
    

}
