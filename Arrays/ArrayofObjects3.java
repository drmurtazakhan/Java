// compile: javac Arrays/ArrayofObjects3.java
// run: java Arrays.ArrayofObjects3
package Arrays;

class People {
	private String name;

	// Constructor to initialize the name
	public People(String name) {
		this.name = name;
	}

	// Reverses the order of elements in an array of People objects in place
	public static void reverseArray(People[] people) {
		for (int i = 0; i < (people.length - 1) / 2; i++) {
			People temp = people[i]; // Temporarily store the current element
			people[i] = people[people.length - i - 1]; // Move the symmetric element from the end to the front
			people[people.length - i - 1] = temp; // Place the temporary element at the end
		}
	}

	// Returns the name when the object is printed
	@Override
	public String toString() {
		return name;
	}
}

public class ArrayofObjects3 {
	public static void main(String[] args) {
		// Create an array to hold 5 People objects
		People[] peopleArray = new People[5];
		peopleArray[0] = new People("K");
		peopleArray[1] = new People("H");
		peopleArray[2] = new People("N");
		peopleArray[3] = new People("M");
		peopleArray[4] = new People("A");

		// Reverse the array order using the helper method
		People.reverseArray(peopleArray);

		// Print each element from the reversed array
		for (int i = 0; i < peopleArray.length; i++) {
			System.out.println(peopleArray[i]);
		}
	}
}