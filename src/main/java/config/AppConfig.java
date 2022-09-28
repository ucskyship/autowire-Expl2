package config;

import beans.Car;
import beans.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class AppConfig {

    @Bean
    public Driver driver(){
        Driver driver = new Driver("Femi", new Car());
        driver.setName("Femi");
        return driver;
    }

    @Bean
    public Car car(){
        return new Car();
    }
}
