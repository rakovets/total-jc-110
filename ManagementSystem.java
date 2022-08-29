import java.util.Collection;

public class ManagementSystem {
    public int getCountOfUsers(Collection<User> collection) {
        return collection.size();
    }

    public int getCountOfGroops(Collection<Groop> collection) {
        return collection.size();
    }

    public String infoAboutUser(User user) {
        return '\n' +
                "Name = " + user.getName() +
                ", age = '" + user.getAge() +
                ", role = '" + user.getRole() + '\''
                ;
    }
}