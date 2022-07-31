package designpatterns.singleton.example;

public class RuntimeExample {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();  // new 인스턴스 생성 불가. getRuntime()으로만 가능
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }

}
