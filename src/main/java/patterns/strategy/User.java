package patterns.strategy;

public class User extends BaseUser {

    public User() {
        super(new UserSignUp());
    }
}