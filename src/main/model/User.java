package main.model;

import java.util.Objects;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private Role role;

    public User(String firstName, String lastName, int age, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.role = role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && firstName.equals(user.firstName)
                && lastName.equals(user.lastName) && role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", role=" + role +
                '}';
    }
}
