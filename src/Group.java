import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group {
    private final Map<User, Role> users = new HashMap<>();

    public void addUser(Role role, User user) {
        users.put(user, role);
    }

    public Map<User, Role> getUsers() {
        return users;
    }

    public List<Map.Entry<User, Role>> getUsersByRole(Role role) {
        return this.users.entrySet().stream()
                .filter(x -> x.getValue() == role)
                .collect(Collectors.toList());
    }
}
