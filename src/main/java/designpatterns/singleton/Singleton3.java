package designpatterns.singleton;

import java.io.Serializable;

public class Singleton3 implements Singleton, Serializable {

    // volatile(java 1.5 이상) 추가해야 double-checked locking 완성
    private static volatile Singleton3 instance;

    private Singleton3() { }

    public static Singleton3 getInstance() {
        // Double-checked locking 사용하여 getInstance() 호출할 때마다 locking 하지 않도록 처리
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }

        return instance;
    }

    // 역직렬화 대응 방안
    protected Object readResolve() {
        return getInstance();

        // 원래 코드에서는 새 인스턴스를 반환한다.
    }

}
