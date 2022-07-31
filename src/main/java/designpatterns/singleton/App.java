package designpatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public String line = "---------------------------------------";

    public static void main(String[] args) throws Exception {
        App app = new App();

        // Instance 비교하기
        app.compareInstance();

        // Reflection 사용하여 Singleton Pattern 깨뜨리기 (Singleton1)
        app.interruptByReflection();

        // 직렬화 & 역직렬화 이용하여 Singleton Pattern 깨뜨리기 (Singleton2)
        app.interruptBySerialization(false);

        // 역직렬화 시점에 방어하기 (Singleton3 클래스에 readResolve() override)
        app.interruptBySerialization(true);

        // Enum 으로 Reflection 방어하기 (Singleton5)
        app.defenseReflectionByEnum();

        // Enum 으로 직렬화 & 역직렬화 방어하기 (Singleton5)
        app.defenseSerializationByEnum();
    }

    private void compareInstance() {
        Singleton singleton1 = Singleton1.getInstance();
        Singleton singleton2 = Singleton2.getInstance();
        Singleton singleton3 = Singleton3.getInstance();
        Singleton singleton4 = Singleton4.getInstance();

        System.out.println(singleton1 == Singleton1.getInstance());
        System.out.println(singleton2 == Singleton2.getInstance());
        System.out.println(singleton3 == Singleton3.getInstance());
        System.out.println(singleton4 == Singleton4.getInstance());
        System.out.println(line);
    }

    private void interruptByReflection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Singleton1> constructor = Singleton1.class.getDeclaredConstructor();
        constructor.setAccessible(true);  // private constructor 접근 가능
        Singleton1 singleton1 = constructor.newInstance();

        System.out.println(singleton1 == Singleton1.getInstance());  // false
        System.out.println(line);
    }

    private void interruptBySerialization(boolean isDefensive) throws IOException, ClassNotFoundException {
        Singleton singleton;
        Singleton newSingleton;

        if (!isDefensive) {
            singleton = Singleton2.getInstance();
            serialize(singleton);
            // deserialize
            try (ObjectInput in = new ObjectInputStream(new FileInputStream("file/singleton.obj"))) {
                newSingleton = (Singleton2) in.readObject();
            }
        } else {
            singleton = Singleton3.getInstance();
            serialize(singleton);
            // deserialize
            try (ObjectInput in = new ObjectInputStream(new FileInputStream("file/singleton.obj"))) {
                newSingleton = (Singleton3) in.readObject();
            }
        }

        System.out.println(singleton == newSingleton);
        System.out.println(line);
    }

    private void serialize(Singleton singleton) throws IOException {
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file/singleton.obj"))) {
            out.writeObject(singleton);
        }
    }

    private void defenseReflectionByEnum() {
        Singleton5 singleton = Singleton5.INSTANCE;
        Singleton5 newSingleton = null;

        Constructor<?>[] constructors = Singleton5.class.getDeclaredConstructors();
        try {
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                newSingleton = (Singleton5) constructor.newInstance("INSTANCE");  // Exception 발생
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("CANNOT REFLECTIVELY CREATE ENUM OBJECTS");

            newSingleton = Singleton5.INSTANCE;
        }

        System.out.println(singleton == newSingleton);  // true
        System.out.println(line);
    }

    private void defenseSerializationByEnum() throws IOException, ClassNotFoundException {
        Singleton5 singleton = Singleton5.INSTANCE;
        Singleton5 newSingleton;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file/singleton.obj"))) {
            out.writeObject(singleton);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("file/singleton.obj"))) {
            newSingleton = (Singleton5) in.readObject();
        }

        System.out.println(singleton == newSingleton);
        System.out.println(line);
    }

}
