package patterns.singleton;

public class Test {
    private static Test test1;

    private Test() {
    }

    public static Test getTest1() {
        if (test1 == null) {
            test1 = new Test();
        }
        return test1;
    }
}
