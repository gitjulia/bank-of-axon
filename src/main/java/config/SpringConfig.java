package config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import web.CustomerController;

import static org.springframework.boot.SpringApplication.run;

@EnableAutoConfiguration
public class SpringConfig {

    public static void main(String[] args) {
        run(CustomerController.class, args);
    }
}
