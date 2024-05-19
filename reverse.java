import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // int[] a = new int[8];
        //      int[][] b = new int[2][4];
        //    //  System.out.println(a.length);
        //  System.out.println(b.length);

        /*String abc = "hello";
        for(int i = 0; i<abc.length()/2;i++)
        {
          int first = i;
          int last = abc.length() - 1 - i;
        
          char firstindex = abc.charAt(first);
          char lastindex = abc.charAt(last);
        
          abc.setcharAt(first, lastindex);
          abc.replace(back, firstindex);
        
        }
        System.out.println(abc);
        */
    

    int []a= new int [8];
     System.out.println("enter a number = ");

     for (   int i = 0;i<8;i++)
     {
        System.out.print("Entr   num ");
          a[i] = sc.nextInt();
    }
    
    int l = a.length;
    int temp;

    for( int i = 0;i<a.length/2 ;i++)
    {
        temp = a[i];
        a[i] = a[l - 1 - i];
        a[l - i - 1] = temp;
    }
    
    for (int i = 0; i <= 8; i++)
    
    {
        System.out.println(a[i] + " ");
    }
    }
}

