package coursemanagement.student.entity;

import coursemanagement.commond.User;

public class Student extends User {
    private char grade;

    public Student(String name, String surname, String email, char grade) {
        super(name, surname, email);
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        System.out.println("student");
        return " Id: " + getId() + "\n"
                + " Name: " + getName() + "\n"
                + " Surname: " + getSurname() + "\n"
                + " Email: " + getName() + "\n"
                + " Grade: " + getGrade();

    }
}
