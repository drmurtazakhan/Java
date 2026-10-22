// Superclass Person
class Person {
    protected String name;  // Accessible to subclasses
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
        super(name, age);
        this.studentId = studentId;
    }

    // Overriding the display() method
    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}

// Subclass Teacher inherits from Person
class Teacher extends Person {
    private String staffId;
    private double salary;

    // Constructor
    public Teacher(String name, int age, String staffId, double salary) {
        super(name, age);
        this.staffId = staffId;
        this.salary = salary;
    }

    // Overriding the display() method
    @Override
    public void display() {
        super.display();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Salary: $" + salary);
    }
}

// Main class
public class Inheritance_PersonStudentTeacher {
    public static void main(String[] args) {
        // Creating a Person object
        Person p1 = new Person("Ali", 30);
    	
        // Creating a Student object
        Student s1 = new Student("Maryam", 20, "S12345");

        // Creating a Teacher object
        Teacher t1 = new Teacher("Dr. Ahmed", 45, "T67890", 55000);

        // Displaying information
        p1.display(); // Calls display() method from Person class
        System.out.println("----------------------");
        s1.display(); // Calls overridden display() method from Student class
        System.out.println("----------------------");
        t1.display(); // Calls overridden display() method from Teacher class
    }
}
