package SystemUser;

import java.util.Objects;

public class SystemUser {
    private String name;
    private int age;
    private String email;

    public SystemUser(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "SystemUser{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + age + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SystemUser that = (SystemUser) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + email.hashCode();
    }
}
