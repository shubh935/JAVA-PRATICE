import java.util.Scanner;



    // Abstract class
abstract class Sunstar {
	abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends Sunstar {
	void printInfo()
	{
		String name = "avinash";
		int age = 21;
		float salary = 222.2F;

		System.out.println(name);
		System.out.println(age);
        System.out.println(salary);
        void display()
        {
            System.out.println("hello");
        }
	}
}

// Base class
class abstract_class {
	public static void main(String args[])
	{
        Sunstar s = new Employee();
        Employee e = new Employee();
        e.printInfo();
        s.display();
		//s.printInfo();
	}
}

    

