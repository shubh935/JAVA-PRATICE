import java.util.Scanner;

package  school;

class student {
    int roll;
    String name;

    public void set_roll(int roll) {
        this.roll = x;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void get_roll()
    {
     System.out.print(roll +"\n");
    } 

    public void get_name()
    {
     System.out.print(name +"\n");
    
    }



    public static void main(String[] args) {
        student s = new student();
        s.set_name("Shubham");
        s.get_name();


    }

}
