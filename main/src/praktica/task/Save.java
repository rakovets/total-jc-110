package praktica.task;

import java.util.HashMap;
import java.util.Map;

public class Save {
    private final Map<Integer, User> users = new HashMap<>();
    private int initialUserId = 0;

    private int userCounter() {
        return initialUserId++;
    }

    public void addUser(User user) {
        users.put(userCounter(), user);
    }

    public Map<Integer, User> getUsers() {
        return users;
    }
}
