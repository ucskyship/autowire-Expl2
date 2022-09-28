package beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
public class Car {
    private String model;
    private String brand;

    public Car() {
    }
}
