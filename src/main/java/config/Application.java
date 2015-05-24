package config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import web.CustomerController;

import static org.springframework.boot.SpringApplication.run;

@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        run(CustomerController.class, args);
    }
}
