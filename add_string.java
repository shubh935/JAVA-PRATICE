import java.util.Arrays;

public class add_string {
    public static void main(String[] args) {
        String s1 = "shubham";
        String s2 = "singh";
        string s3;

        int i = 1;
        int j = 1;

        while (i < s1.length() && j < s2.length()) {
            s3 = s3 + s1[i];
            s3 = s3 + s2[j];
            i++;
            j++;
            
        }

        while(i<s1.length())
        {
            s3 = s3 + s1[i];
            i++;
        }

        while(j<s2.length())
        {
            s3 = s3 + s2[j];
            j++;
        }

        System.out.print(s3);
    }
    
}
