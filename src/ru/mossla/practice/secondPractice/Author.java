package ru.mossla.practice.secondPractice;

public class Author {
    private String name;
    private String email;
    private Character gender;

    public Author(String name, String email, Character gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Character getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
