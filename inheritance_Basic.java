import java.util.Scanner;

class A {
        Scanner sc = new Scanner(System.in);
        String s1;
        String s2;
        public void sets() {
          //  s1 = sc.next();
            System.out.println(s1);
        }

        public void gets() {

            System.out.print("Enter second name ");
            s2 = sc.next();
        }
        //  System.out.print(x + " ");

    }

class B extends A {

     

        public void set2() {
            s1 = "aarya ji";
       //     x = y;
          //  System.out.print(x + " ");
          //    System.out.print(s1 + " ");

        }

    
    }
        
    public class inheritance_Basic {

        public static void main(String args[]) {

            // Scanner sc = new Scanner(System.in);
        
            B cc = new B();
            A vv = new A();
               // cc.sets();
                cc.set2();
                //vv.sets();//jis  object se hum value set kiye hain ussi obkect se umko call krna hoga warna answer nhi milega
                bb.sets();
                
            }

        }

    