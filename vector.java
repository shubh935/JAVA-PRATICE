import java.util.Vector;
import java.util.Scanner;

public class vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector <Integer>arr = new Vector();
        for(int i =0; i<3; i++)
        {

            arr.add(sc.nextInt());
        }

      Vector <Integer>arr2 = new Vector();
      for(int i =0; i<3; i++)
      {
          arr2.add(sc.nextInt());
      }
         
         //  arr.add(555);    // add element in last position
         // arr.add(1, 556);  // add at specific place
        //arr.addAll(arr2);
        // arr.remove(2);       // remove at specified nodes   
       //  arr.removeAll(arr2);
       //System.out.print( arr.capacity()  +"\n");  //means no of space
       //System.out.print(arr.size() + " \n");// no current element
      arr.sort(null);
      //arr.removeAll(arr2);


        for(int x : arr)
        {
            
            System.out.print(x + " ");

        }

        
    }
    
}
