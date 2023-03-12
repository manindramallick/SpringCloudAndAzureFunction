package org.example.functions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class HelloworldApplication {
    public static void main(String[] args) throws Exception {
       SpringApplication.run(HelloworldApplication.class, args);
   }

    @Bean
    public Function<Employee, EmployeeGreeting> welcomeEmployee() {
        return employee -> new EmployeeGreeting("Hello, We welcome you , " + employee.getName());
    }
}
