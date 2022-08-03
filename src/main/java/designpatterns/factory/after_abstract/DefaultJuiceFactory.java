package designpatterns.factory.after_abstract;

import java.util.Locale;

// Java 9 미만은 private method 구현이 interface 에서 불가하다.
// 이 때는 추상클래스를 연계하여 처리하는 방법을 쓸 수 있다.
public class DefaultJuiceFactory implements JuiceFactory {

    @Override
    public void validate(String name, String email) {
        if (name == null || name.replaceAll(" ", "").isEmpty()) {
            throw new IllegalArgumentException("PLEASE SET NAME OF THE JUICE");
        }
        if (email == null || email.replaceAll(" ", "").isEmpty()) {
            throw new IllegalArgumentException("PLEASE LEAVE YOUR EMAIL");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name.toUpperCase(Locale.ROOT) + " IS ON THE PROCESS NOW");
    }

    @Override
    public Juice createJuice() {
        return null;
    }

    @Override
    public void sendEmailTo(String email, Juice juice) {
        System.out.println(juice.getName().toUpperCase(Locale.ROOT) + " IS READY");
    }

}
