import java.util.Scanner;
import java.util.thread;

public class threading_concept {
    public static void main(String[] args) {

      thread  t1(getters);
       thread t2(setters);
       t1.join();
       t2.join();

    }

    public static void getters() {
        for (int i = 0; i <= 10; i++) {
            System.out.print((2 * i) + " ");
        }
    }

    
    public static void setters() {
        for (int i = 0; i <= 10; i++) {
            System.out.println((3 * i) + " ");
        }
    }
}
