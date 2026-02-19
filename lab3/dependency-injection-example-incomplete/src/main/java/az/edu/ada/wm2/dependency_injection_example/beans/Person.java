package az.edu.ada.wm2.dependency_injection_example.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

//    private String id;
//    private String firstName;
//    private String lastName;
//
//    // Default constructor (required by Spring)
//    public Person() {
//    }
    @Value("PER000")
    private String id;

    @Value("DefaultFirst")
    private String firstName;

    @Value("DefaultLast")
    private String lastName;

    public Person() {}

    // Constructor with fields (optional)
    public Person(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Override toString() for easy printing
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
