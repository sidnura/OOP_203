package Bridge;

public class Main {
    public static void main(String[] args) {
        User user = new User(new BirdImpl());
        user.toFish();
    }
}