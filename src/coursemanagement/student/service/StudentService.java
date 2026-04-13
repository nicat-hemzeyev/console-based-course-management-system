package coursemanagement.student.service;

import coursemanagement.commond.Db;
import coursemanagement.student.entity.Student;

import java.util.Scanner;

public class StudentService {
    public static void main(String[] args) {
        newStudent();
    }

    public static void newStudent() {
        System.out.println("Nece telebe qeydiyyatdan kecirmek isteyirsiz: ");
        int number = new Scanner(System.in).nextInt();
        Student[] newStudents = new Student[number];
        for (int i = 0; i < newStudents.length; i++) {
            System.out.println("qeydiyyat " + (i + 1) + ".");
            newStudents[i] = requireAndCreate();
        }
        System.out.println();
        Db.students = newStudents;
    }

    public static void newAddStudent() {
        Student[] oldStudent = Db.students;
        System.out.println("nece telebe elave etmek isteyirsiz?");
        int number = new Scanner(System.in).nextInt();
        Student[] newStudents = new Student[oldStudent.length + number];
        for (int i = 0; i < oldStudent.length; i++) {
            newStudents[i] = oldStudent[i];
        }
        for (int j = oldStudent.length; j < newStudents.length; j++) {
            newStudents[j] = requireAndCreate();
        }
    }
    public static Student requireAndCreate() {
        System.out.println("Telebenin adini daxil edin: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Telebenin soyadini daxil edin: ");
        String surname = new Scanner(System.in).nextLine();
        System.out.println("Telebenin yasini daxil edin: ");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Telebenin emailini daxil edin: ");
        String email = new Scanner(System.in).nextLine();
        return new Student(name, surname, age, email);

    }

    public static void update() {
        Student[] students = Db.students;
        System.out.println("Hansi telebeni yenilemek etmek isteyirsiz:");
        int updateIndex = new Scanner(System.in).nextInt();
        Student student = students[updateIndex - 1];
        System.out.println("hansi xanani update etmek isteyirsen name,surname,age");
        String updateField = new Scanner(System.in).nextLine();
        if (updateField.equals("name")) {
            System.out.println("adini daxil edin:");
            student.setName(new Scanner(System.in).nextLine());
        } else if (updateField.equals("surname")) {
            System.out.println("soyadini daxil edin:");
            student.setSurname(new Scanner(System.in).nextLine());
        } else if (updateField.equals("age")) {
            System.out.println("adini daxil edin:");
            student.setAge(new Scanner(System.in).nextInt());
        }
    }
    public static void delete() {
        Student[] students=Db.students;
        System.out.println("Nece nomreli telebeni silmek isteyirsiz:");
        int number = new Scanner(System.in).nextInt();
        students[number - 1] = null;
        System.out.println("telebe silindi");
    }

    public static void find() {
        Student[] students = Db.students;
        System.out.println("axtarmaq istediyiniz telebenin adini ve soyadini daxil edin:");
        String text = new Scanner(System.in).nextLine();
        for (int i = 0; i < students.length; i++) {
            Student t = students[i];
            if (t == null) continue;
            if (t.getName().equals(text) || t.getSurname().equals(text)) {
                System.out.println(t);
            }
        }
    }

    public static void printAll() {
        Student[] students = Db.students;
        System.out.println("Qeydiyyatdan kechen telebeler:");
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) continue;
            System.out.println((i + 1) + "." + students[i]);
        }

    }
}
