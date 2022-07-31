package designpatterns.singleton;

public class Singleton1 implements Singleton {

    private static Singleton1 instance;

    private Singleton1() { }

    // Thread-safe 하지 않은 문제가 있어 synchronized 키워드 붙여준다.
    // 다만 getInstance() 호출할 때마다 동기화 작업이 들어가 성능이 일부 저하될 여지가 있다.
    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }

        return instance;
    }

}
