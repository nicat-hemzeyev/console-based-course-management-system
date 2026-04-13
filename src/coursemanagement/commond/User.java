package coursemanagement.commond;

public class User {
    private int Id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private static int idCounter = 1;
    public User(){

    }
    public User(String name, String surname,int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age =age;
        this.email = email;
        this.Id = idCounter++;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
