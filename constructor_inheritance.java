import java.util.Scanner;

class parent {
  /*  parent()

  {
      System.out.print("am a parent class constructor  \n");
     }
*/
    parent(int a) {
        System.out.print("am a parent class_parametrised constructor  \n");

    }
}

class child extends parent
{
    child()
    {
       // super(5);
        System.out.print("am a child class constructor \n");

    }
    
    child(int b)
    {
        System.out.print("am a child class_paranetrised constructor \n");

    }
}

public class constructor_inheritance {
    public static void main(String[] args) {

     // parent aa = new parent(3);
      child bb = new child(2);
        
    }
    
}
