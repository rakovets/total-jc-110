package main.runner;

import main.Menu;
import main.MenuImp;
import main.model.Group;
import main.model.User;

public class UserManagementSystemApp {
    public static void main(String[] args) {
        Menu menu = new MenuImp();

        User user = menu.createUser();

        Group users = menu.createGroup();

        System.out.println(menu.addUserFromGroup(user, users));
        System.out.println(menu.printUser(user));
        System.out.println(menu.addUserFromGroup(user, users));
        System.out.println(menu.printUser(user));
        System.out.println(menu.printGroup(users));
    }
}
