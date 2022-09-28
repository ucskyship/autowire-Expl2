package beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
public class Driver {
    private String name;

    @Autowired
    private final Car car;
}
