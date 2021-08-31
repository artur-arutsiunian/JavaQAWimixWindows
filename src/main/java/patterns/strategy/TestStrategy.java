package patterns.strategy;

public class TestStrategy {

    public static void main(String[] args) {

        Admin admin = new Admin();
        User user = new User();

        System.out.println("Admin flow:");
        admin.makeSignUp();
        admin.makeSignOut();
        admin.makeSignIn();

        System.out.print("\n");

        System.out.println("User flow:");
        user.makeSignUp();
        user.makeSignOut();
        user.makeSignIn();
    }
}