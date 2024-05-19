import java.util.Scanner;


class parent 
{
    public void f1() {
        System.out.print("am a parent class f1  \n");
    }

    public void f2() {
        System.out.print("am a parent class f2  \n");
}
    
}

class child extends parent {
    public void f1() {
        System.out.print("am a child class f1  \n");
    }
    public void f2(int x) {
        System.out.print("am a child class f2  \n");
}
}


public class overriding_Inher {
    public static void main(String[] args) {
        child cc = new child();
        cc.f2(5);
      //  parent vv = new child();
      //  vv.f1();
    }
    
}
