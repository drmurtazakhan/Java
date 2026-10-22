// Superclass Person
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student inherits from Person
class Student extends Person {
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        // Calling the constructor of the base class (Person)
        super(name, age);
        this.studentId = studentId;
    }

    // Overriding the display() method
    @Override
    public void display() {
        // Calling the base class method
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}

public class InheritancePersonStudent {
    public static void main(String[] args) {
        // Creating a Person object
        Person p1 = new Person("Ali", 30);

        // Creating a Student object
        Student s1 = new Student("Maryam", 20, "S12345");

        p1.display(); // display() method from the Person class
        s1.display(); // display() method from the Student class
    }
}
