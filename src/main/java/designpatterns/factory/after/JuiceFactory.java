package designpatterns.factory.after;

import java.util.Locale;

public interface JuiceFactory {

    default Juice orderJuice(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Juice juice = createJuice();
        sendEmailTo(email, juice);
        return juice;
    }

    // Java 9 부터 interface 내에서 private method 구현 가능.
    // 대신 default 로 설정
    default void validate(String name, String email) {
        if (name == null || name.replaceAll(" ", "").isEmpty()) {
            throw new IllegalArgumentException("PLEASE SET NAME OF THE JUICE");
        }
        if (email == null || email.replaceAll(" ", "").isEmpty()) {
            throw new IllegalArgumentException("PLEASE LEAVE YOUR EMAIL");
        }
    }

    default void prepareFor(String name) {
        System.out.println(name.toUpperCase(Locale.ROOT) + " IS ON THE PROCESS NOW");
    }

    Juice createJuice();

    default void sendEmailTo(String email, Juice juice) {
        System.out.println(juice.getName().toUpperCase(Locale.ROOT) + " IS READY");
    }

}
