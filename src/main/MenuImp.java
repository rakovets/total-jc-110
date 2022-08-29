package main;

import main.model.Group;
import main.model.Role;
import main.model.User;

import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MenuImp implements Menu {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public User createUser() {
        System.out.println("First Name");
        String firstName = scanner.nextLine();
        System.out.println("Last Name");
        String lastName = scanner.nextLine();
        System.out.println("Age");
        int age = scanner.nextInt();
        return new User(firstName, lastName, age, Role.USER);
    }

    @Override
    public Group createGroup() {
        System.out.println("Group name");
        String groupName = scanner.nextLine();
        return new Group(groupName);
    }

    @Override
    public String addUserFromGroup(User user, Group group) {
        group.getUsers().add(user);
        return "User added to group " + group.getGroupName();
    }

    @Override
    public String printGroup(Group group) {
        Collection<User> users = group.getUsers();
        return users.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    @Override
    public String printUser(User user) {
        return user.toString();
    }
}
