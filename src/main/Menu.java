package main;

import main.model.Group;
import main.model.User;

public interface Menu {
    User createUser();

    Group createGroup();

    String addUserFromGroup(User user, Group group);

    String printGroup(Group group);

    String printUser(User user);
}
