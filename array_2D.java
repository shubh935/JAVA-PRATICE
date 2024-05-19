import java.util.Scanner;

public class array_2D {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
    
      int sum;
      int arr[][] = new int[3][3];
     int arr2[][]  = new int[3][3];
     System.out.print("ENter first array element \n");
 
  int sum[][]= new int [3][3];
  for(int i = 0;i<3;i++)
  {
      for(int j = 0;j<3; j++)
      {
          arr[i][j] = sc.nextInt(); ;
      }
      
  }

 System.out.print("ENter Second array element \n");

  for(int i = 0;i<3;i++)
  {
      for(int j = 0;j<3; j++)
      {
          arr2[i][j] = sc.nextInt();
      }
      
  }
for(int i = 0;i<3;i++)
{
    for(int j = 0;j<3; j++)
    {
        sum[i][j] = arr[i][j]+arr2[i][j];
    }
}
   for(int i = 0;i<3;i++)
   {
    
      for(int j = 0;j<3; j++)
      {
          System.out.print(sum[i][j] + " ");
      
      }
      System.out.println();
  }
 
 

}
    
}
