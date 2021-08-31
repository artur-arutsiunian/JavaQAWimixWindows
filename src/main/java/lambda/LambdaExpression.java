package lambda;

import lombok.SneakyThrows;

import java.util.concurrent.TimeoutException;


public class LambdaExpression {

    @SneakyThrows
    private static void sleep(int sleepTime) {
        Thread.sleep(sleepTime);
    }

    public static void whileTrue(int pollingIntervalMs, int timeoutMilliseconds, MyInterface<Boolean> myInterface, String exceptionMsg) throws TimeoutException {
        long timeStart = System.currentTimeMillis();
        while (myInterface.get()) {
            if (System.currentTimeMillis() - timeStart > timeoutMilliseconds) {
                throw new TimeoutException(String.format("Time out after %d ms: ", timeoutMilliseconds) + exceptionMsg);
            }
            System.out.println("try again...");
            sleep(pollingIntervalMs);
        }
    }

    public static void main(String[] args) throws TimeoutException {
        whileTrue(2000, 6000, () -> {
            return Math.random() * 2 > 1;
        }, "FAILED");
    }
}