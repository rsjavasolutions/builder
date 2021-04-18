import java.math.BigDecimal;

public class Car {
    private String brand;
    private String model;
    private BigDecimal price;
    private String color;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Car car = new Car();

        public Builder brand(String brand) {
            car.brand = brand;
            return this;
        }

        public Builder model(String model) {
            car.model = model;
            return this;
        }

        public Builder price(BigDecimal price) {
            car.price = price;
            return this;
        }

        public Builder color(String color) {
            car.color = color;
            return this;
        }

        public Car build() {
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
