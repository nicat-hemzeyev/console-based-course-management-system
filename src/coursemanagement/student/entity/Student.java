package coursemanagement.student.entity;

import coursemanagement.commond.User;

public class Student extends User {
    public Student() {
        super();
    }

    public Student(String name, String surname, int age, String email) {
        super(name, surname, age, email);
    }

    @Override
    public String toString() {
        System.out.println("student");
        return " Id: " + getId() + "\n"
                + " Name: " + getName() + "\n"
                + " Surname: " + getSurname() + "\n"
                + " Age: " + getAge() + "\n"
                + " Email: " + getEmail();


    }
}
