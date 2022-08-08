package designpatterns.factory_abstract.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

    @Bean
    public LampFactory lampFactoryJava() {
        return new LampFactory();
    }

}
