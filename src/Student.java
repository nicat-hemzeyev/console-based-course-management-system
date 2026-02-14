public class Student extends User {
    char grade;
    String getRole(){
        return "STUDENT";
    }
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
