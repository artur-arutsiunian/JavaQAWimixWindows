package patterns.strategy;

public class Admin extends BaseUser {

    public Admin() {
        super(new AdminSignUp());
    }


}