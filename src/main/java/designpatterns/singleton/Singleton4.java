package designpatterns.singleton;

public class Singleton4 implements Singleton {

    private Singleton4() { }

    // Static inner 클래스 사용
    // Lazy loading 가능
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
