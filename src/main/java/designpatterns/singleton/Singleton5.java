package designpatterns.singleton;

// shift * 2 -> Show Bytecode 에서 init 확인
public enum Singleton5 {

    // Reflection, 직렬화 & 역직렬화의 방어가 가능하지만 로딩하는 순간 인스턴스가 미리 만들어지는 단점이 있다.
    // 상속을 쓸 수 없다. (오로지 Enum 만 상속 가능)
    // 위 단점이 크게 문제가 되지 않는다면 가장 완벽한 방법이라 할 수 있다.
    INSTANCE;

}
