import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User {
    private String name;
    private int age;
    private EnumTypes.Role role;

    public User(String name, int age, EnumTypes.Role role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public int getCountOfUsers(Collection<User> collection) {
        return collection.size();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EnumTypes.Role getRole() {
        return role;
    }
}