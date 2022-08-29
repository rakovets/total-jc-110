import java.util.Scanner;

public class Engine implements Runnable {
    private final Group group;
    private final Scanner scanner = new Scanner(System.in);
    private boolean isRunning = true;
    private Role role;

    public Engine(Group group) {
        this.group = group;
    }

    private void createUser() {
        chooseRole();
        System.out.print("Enter user first name: ");
        String firstName = scanner.next();
        System.out.print("Enter user last name: ");
        String lastName = scanner.next();
        System.out.print("Enter user age: ");
        int age = scanner.nextInt();
        group.addUser(Role.USER, new User(firstName, lastName, age));
        System.out.println("User added to group " + this.role);
    }

    private void chooseRole() {
        System.out.println("Choose user role: \n" +
                "1 - Admin \n" +
                "2 - Moderator \n" +
                "3 - User \n");
        int roleId = scanner.nextInt();
        switch (roleId) {
            case 1:
                role = Role.ADMIN;
                break;
            case 2:
                role = Role.MODERATOR;
                break;
            case 3:
                role = Role.USER;
                break;
            default:
                break;
        }
    }

    private void printMenu() {
        System.out.println("\n Choose point of menu: \n" +
                "0 - Exit \n" +
                "1 - Create user \n" +
                "2 - Print all users \n" +
                "3 - Get users by role \n");
    }

    private void choosePointOfMenu() {
        int numberOfMenu = scanner.nextInt();
        switch (numberOfMenu) {
            case 0:
                isRunning = false;
                break;
            case 1:
                createUser();
                break;
            case 2:
                System.out.println(group.getUsers());
                break;
            case 3:
                chooseRole();
                System.out.println(group.getUsersByRole(this.role));
                break;
            default:
                break;
        }
    }

    @Override
    public void run() {
        while (isRunning) {
            printMenu();
            choosePointOfMenu();
        }
    }
}
