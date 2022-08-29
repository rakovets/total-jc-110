import java.util.List;

public class Group extends User {
    private List<String> id;
    private List<String> firstName;
    private List<String> secondName;
    private List<String> password;

    public Group(String id, String firstName, String secondName, String password) {
        super(id, firstName, secondName, password);
    }
}


