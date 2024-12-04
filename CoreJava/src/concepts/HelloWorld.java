package concepts;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		// Primitive Data Types
        int age = 25;       // Integer
        double salary = 50000.50; // Decimal
        char grade = 'A';   // Character
        boolean isEmployed = true; // Boolean
        
        // Non-Primitive Data Types
        String name = "John"; // String
        int[] marks = {85, 90, 78}; // Array
        
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Employed: " + isEmployed);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
	}

}
