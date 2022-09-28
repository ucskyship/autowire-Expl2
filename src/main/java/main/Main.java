package main;

import beans.Car;
import beans.Driver;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppConfig.class)){
            Driver driver = context.getBean(Driver.class);
            System.out.println(driver);

            Car car = context.getBean(Car.class);
            System.out.println(car);
        } catch (Exception e){
            System.out.println("not found " + e);
        }
    }
}
