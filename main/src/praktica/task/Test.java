package praktica.task;

public class Test {
    public static void main(String[] args) {
        Save storage = new Save();
        Thread engine = new Thread(new Execute(storage));
        engine.start();
    }
}
