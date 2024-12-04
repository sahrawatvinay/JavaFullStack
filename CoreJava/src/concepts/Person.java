package concepts;

public class Person {
    // Properties (Fields)
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown"; // Default values
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Custom Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main Method to Test the Class
    public static void main(String[] args) {
        // Using Default Constructor
        Person person1 = new Person();
        person1.displayInfo(); // Output: Name: Unknown, Age: 0

        // Setting properties using setters
        person1.setName("Alice");
        person1.setAge(25);
        person1.displayInfo(); // Output: Name: Alice, Age: 25

        // Using Parameterized Constructor
        Person person2 = new Person("Bob", 30);
        person2.displayInfo(); // Output: Name: Bob, Age: 30
    }
}

