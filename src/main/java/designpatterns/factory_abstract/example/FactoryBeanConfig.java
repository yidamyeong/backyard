package designpatterns.factory_abstract.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

    @Bean
    public LampFactory lampFactory() {
        return new LampFactory();
    }

}
