public class User {
    private String id;
    private String firstName;
    private String secondName;
    private String password;

    public User(String id, String firstName, String secondName, String password){
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.password = password;
    }

    public String setID(String id){
        return this.id;
    }
    public String setFirstName(String firstName){
        return this.firstName;
    }

    public String setSecondName(String secondName){
        return this.secondName;
    }

    public String setPassword(String password){
        return this.password;
    }

    public String getID(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public String getPassword(){
        return password;
    }
}
