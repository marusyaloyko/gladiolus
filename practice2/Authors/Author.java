package practice2.Authors;

public class Author {

    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Имя " + name + "\nэлектроннная почта " + email + "\nпол " + gender;
    }
}


