public class UserApplication {
    public static void main(String[] args) {
        Group group = new Group();
        Thread engine = new Thread(new Engine(group));
        engine.start();
    }
}
