import java.util.Scanner;

class A
{
    int x = 5;
    static int y; //this y is shared for all object of class A
   
    public   void setter()
    {
        //we can't create static varibale in non static function
        static int x = 5;
        System.out.println(x);
    }
    
        public static int setter()
        {
           
        }
}
class static_variable {
    public static void main(String[] args) {
        A c = new A();
        c.setter();
        A.y = 4; // acces static variavle
        A.setter; //call static function
        
    }
    
}
