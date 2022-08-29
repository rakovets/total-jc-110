import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    private final Map<User, Role> users = new HashMap<>();
    private Role role;

    public void addUser(Role role, User user) {
        users.put(user, role);
    }

    public Map<User, Role> getUsers() {
        return users;
    }

    public List<User> getUsersByRole(Role role) {
        List<User> list = new ArrayList<>();
        for (User user : users.keySet()) {
            if (users.get(user).equals(role)) {
                list.add(user);
            }
        }
        return list;
    }
}
