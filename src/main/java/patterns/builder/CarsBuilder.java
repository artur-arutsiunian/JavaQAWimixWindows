package patterns.builder;

public class CarsBuilder {

    private final Cars cars;

    public CarsBuilder() {
        this.cars = new Cars();
    }

    public CarsBuilder setBrand(String brand) {
        this.cars.brand = brand;
        return this;
    }

    public CarsBuilder setSpeed(int speed) {
        this.cars.speed = speed;
        return this;
    }

    public CarsBuilder setElectro(boolean electro) {
        this.cars.electro = electro;
        return this;
    }

    public CarsBuilder setColor(String color) {
        this.cars.color = color;
        return this;
    }

    public CarsBuilder setMade(String made) {
        this.cars.made = made;
        return this;
    }

    public Cars build() {
        return cars;
    }
}