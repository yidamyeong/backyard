package designpatterns.factory_abstract.example;

import designpatterns.factory_abstract.before.Lamp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Lamp tableLamp = applicationContext.getBean("lampFactory", Lamp.class);  // config.xml 에 등록한건 lampFactory 지만, Lamp Class 객체로 반환 가능
        System.out.println(tableLamp.getName());

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        LampFactory lampFactoryBean = applicationContext1.getBean(LampFactory.class);
        Lamp lampBean = applicationContext1.getBean(Lamp.class);
        System.out.println(lampFactoryBean);
        System.out.println(lampBean);

        System.out.println(applicationContext1.getBean("lampFactoryJava", Lamp.class));
    }

}
