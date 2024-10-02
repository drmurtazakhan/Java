/**
 * Polymorphism via Method Overloading
 
 * Compile-Time Polymorphism (Static Binding)
 * This type of polymorphism is resolved during compile time.
 * It is typically achieved through method overloading and operator overloading.
 
 * Method Overloading: This occurs when multiple methods in
 * the same class have the same name but different parameters
 * (different type or number of parameters).
 */

class MathOperations {
	
	// add method that accept int arguments
    int add(int a, int b) {
        return a + b;
    }

    // add method that accept double arguments
    double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismByMethodOverloading {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        MathOperations object1 = new MathOperations();
        System.out.println(object1.add(a, b)); // pass arguments of type int

        double c = 2.1;
        double d = 3.2;
        MathOperations object2 = new MathOperations();
        System.out.println(object2.add(c, d)); // pass arguments of type double
    }
}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ
