package designpatterns.singleton.example;

import org.springframework.context.annotation.Bean;

public class SpringConfig {

    @Bean
    public String hello() {
        return "hello";
    }

}
