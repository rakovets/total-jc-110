package praktica.task;

import java.util.Scanner;

public class Execute implements Runnable {
    private final Save saves;
    private final Scanner scanner = new Scanner(System.in);
    private boolean isRunning = true;

    public Execute(Save storage) {
        this.saves = storage;
    }

    private void addUserToStorage() {
        System.out.print("user first name: ");
        String firstName = scanner.next();
        System.out.print("user last name: ");
        String lastName = scanner.next();
        System.out.print("user age: ");
        int age = scanner.nextInt();
        saves.addUser(new User(firstName, lastName, age));

    }

    private void printMenu() {
        System.out.println("\n Choose point of menu: \n" +
                "1 - Add new user \n" +
                "2 - Print all users");
    }

    private void choosePointOfMenu() {
        int numberOfMenu = scanner.nextInt();
        switch (numberOfMenu) {
            case 1:
                addUserToStorage();
                break;
            case 2:
                System.out.println(saves.getUsers());
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



