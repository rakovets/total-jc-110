import java.util.ArrayList;
import java.util.List;

public class ManagementDemo {
    public static void main(String[] args) {
        List<Groop> listGroops = new ArrayList<>();
        List<User> groop = new ArrayList<>();
        List<User> listUsers = new ArrayList<>();

        ManagementSystem managementSystem = new ManagementSystem();

        User firstUser = new User("Yegor", 19, EnumTypes.Role.USER);
        listUsers.add(firstUser);

        Groop firstGroop = new Groop("Programmist");
        listGroops.add(firstGroop);

        firstGroop.addUserInGroop(firstUser);

        System.out.println(firstGroop.getCountOfGroop());
        System.out.println(managementSystem.getCountOfUsers(listUsers));
        System.out.println(managementSystem.getCountOfGroops(listGroops));
        System.out.println(managementSystem.infoAboutUser(firstUser));
    }
}