package main.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Group {
    private final Collection<User> users;
    private final String groupName;

    public Group(String name) {
        this.groupName = name;
        this.users = new ArrayList<>();
    }

    public Collection<User> getUsers() {
        return users;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Group group = (Group) o;
        return users.equals(group.users) && groupName.equals(group.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (User user : users) {
            sb.append(user.toString());
        }
        return sb.toString();
    }
}
