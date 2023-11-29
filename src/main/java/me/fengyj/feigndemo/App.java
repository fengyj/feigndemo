package me.fengyj.feigndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(App.class);

        ApplicationContext ctx = application.run(args);
    }
}
