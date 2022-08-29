import java.util.ArrayList;
import java.util.List;

public class Groop {
    private String nameGroop;

    private List<User> GroopList = new ArrayList<>();

    public Groop(String nameGroop) {
        this.nameGroop = nameGroop;
    }

    public void addUserInGroop(User user) {
        GroopList.add(user);
    }

    public int getCountOfGroop() {
        return GroopList.size();
    }
}