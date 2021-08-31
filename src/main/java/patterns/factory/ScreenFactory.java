package patterns.factory;



public class ScreenFactory {

    public BaseScreen getScreen(Screen type) {
        return switch (type) {
            case SPLASH -> new SplashScreen();
            case SIGN_IN -> new LoginScreen();
            case MAIN -> new MainScreen();
            default -> throw new IllegalArgumentException("screen name is incorrect:" + type);
        };
    }
}
enum Screen {
    SPLASH, SIGN_IN, SIGN_UP, MAIN
}