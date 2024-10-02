/**
 * Polymorphism via Method Overriding
 * Runtime Polymorphism (Dynamic Binding)
 * This type of polymorphism is resolved during runtime and is achieved through
 * method overriding.
 
 * Method Overriding: This occurs when a subclass provides a specific implementation
 * of a method that is already defined in its superclass.
 * The method to be executed is determined at runtime based on the object type.
 */

class Cycle {
    void move() {
        System.out.println("A Cycle moves using wheels");
    }
}

class Bicycle extends Cycle {
    void move() {
        System.out.println("A Bicycle moves using two wheels");
    }
}

class Tricycle extends Cycle {
    void move() {
        System.out.println("A Tricycle moves using three wheels");
    }
}

public class PolymorphismByMethodOverriding {
    public static void main(String[] args) {
        Cycle cycle1 = new Bicycle();
        Cycle cycle2 = new Tricycle();

        cycle1.move(); 
        cycle2.move(); 
    }
}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ
