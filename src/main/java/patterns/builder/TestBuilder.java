package patterns.builder;

public class TestBuilder {
    public static void main(String[] args) {
        CarsBuilder carsBuilder = new CarsBuilder();

        Cars cars = carsBuilder
                .setBrand("Volvo")
                .setColor("Black")
                .setElectro(false)
                .setSpeed(100)
                .setMade("Sweden")
                .build();

        //TODO - текущее значение поля объекта
        System.out.printf("This cars made '%s' %n", cars.made);

        //TODO - изменяем значение поля
        carsBuilder.setMade("Belgium");

        //TODO - проверяем измененное значение поля
        System.out.printf("This cars made '%s' %n", cars.made);
    }
}
