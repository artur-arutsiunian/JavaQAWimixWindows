package exceptions;

public class TestExceptions {

    static int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        try {
            array[5] = 6;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Expected behaviour");
            e.printStackTrace();
        } finally {
            System.out.println("FINAL"); //независимо от того попали в catch или нет, то что передаем в finally будет вызвано
        }
    }

    public void tapButton() { //зацикливание, для тапания по элементу пока не пройдет успешно
        try {
            array[5] = 6;
        } catch (ArrayIndexOutOfBoundsException e) {
            tapButton();
        }
    }
}