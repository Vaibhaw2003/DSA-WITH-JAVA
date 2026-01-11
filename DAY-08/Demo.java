//----------DAY-08/Demo.java----------[ OOPS, CLASS, OBJECT, CONSTRUCTOR ]----------

public class Demo {
    // Class attributes
    String name;
    int age;

    // Constructor
    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of the Demo class
        Demo person = new Demo("Alice", 30);

        // Calling the method to display details
        person.displayInfo();
    }
    
}
