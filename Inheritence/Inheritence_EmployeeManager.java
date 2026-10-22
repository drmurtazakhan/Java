// Superclass representing an Employee
class Employee {
    private String name;
    private double salary;

    // Constructor to initialize Employee object
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    // toString method to display Employee object
    public String toString() {
        return "Name: " + name + ", Salary=" + salary;
    }
}

// Subclass of Employee representing a Manager
class Manager extends Employee {
    private String department;

    // Constructor to initialize Manager object 
    public Manager(String n, double s, String d) {
        super(n, s); //call Employee constructor using 'super'
        department = d;
    }

    // Overriding toString() to include department information
    @Override
    public String toString() {
        return super.toString() + ", Department=" + department;
    }
}

// Main class to test inheritance and object behavior
public class Inheritence_EmployeeManager {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee e1 = new Employee("Ali", 65000);
        Employee e2 = new Employee("Khalid", 55000);
        
        // Creating Manager object
        Manager m = new Manager("Maryam", 85000, "Finance");

        // Displaying details of each object using oString() method
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(m);
    }
}


