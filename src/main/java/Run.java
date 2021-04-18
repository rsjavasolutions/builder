import java.math.BigDecimal;

public class Run {
    public static void main(String[] args) {

        //z wykorzystaniem lomboka
        //nie podalem pola email, obiekt sie utworzy ale pole bedzie miało wartość null
        Person rambo = Person.builder()
                .name("John")
                .surname("Rambo")
                .age(33)
                .build();

        System.out.println(rambo);

        //przykład implementacji buildera jako wewnętrznej klasy statycznej
        // nie podałem pola color, obiekt sie utworzy ale pole bedzie miało wartość null
        Car dodge = Car.builder()
                .brand("Dodge")
                .model("Challenger")
                .price(new BigDecimal("90000.00"))
                .build();

        System.out.println(dodge);
    }
}
