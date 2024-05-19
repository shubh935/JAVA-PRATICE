
import java.util.Scanner;

public class string_sorting {
    public static void main(String[] args) {
        String  s1= "shubham";
        char[] arr = s1.toCharArray();
        System.out.println(arr);
        char[] arr2 = new char[25] { 0 };
        for(int i =0;i<=s1.length(); i++)
        {
            arr2[arr[i]]++;
        }
        for(int i =0;i<26; i++)
        {
            if (arr[i] > 0) {
                System.out.print();
                
            }
        }
    }
    
}
