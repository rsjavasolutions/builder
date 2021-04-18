import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person {
    private String name;
    private String surname;
    private int age;
    private String email;
}
