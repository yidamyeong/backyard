package designpatterns.singleton;

import java.io.Serializable;

public class Singleton2 implements Singleton, Serializable {

    // Eager initialization (이른 초기화): Thread-safe
    // 미리 만드는 것 자체가 단점이 될 수도 있다. (애플리케이션 로딩 시간은 길어지는데, 실제로 사용하지 않는 등)
    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() { }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

}
