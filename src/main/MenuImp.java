package main;

import main.model.Group;
import main.model.Role;
import main.model.User;

import java.util.Scanner;

public class MenuImp implements Menu {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public User createUser() {
        return new User(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), Role.USER);
    }

    @Override
    public Group createGroup() {
        return new Group(scanner.next());
    }

    @Override
    public String addUserFromGroup(User user, Group group) {
        group.getUsers().add(user);
        return "User added to group " + group.getGroupName();
    }

    @Override
    public String printGroup(Group group) {
        return group.toString();
    }

    @Override
    public String printUser(User user) {
        return user.toString();
    }
}
