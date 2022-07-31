package designpatterns.singleton.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

public class SpringExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 엄밀히 따지자면 싱글톤 패턴과는 다르다. ApplicationContext 내부에서 유일한 인스턴스만 쓰이도록 만든 유형
        String hello1 = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);

        System.out.println(Objects.equals(hello1, hello2));
    }

}
