package designpatterns.factory.example;

import designpatterns.factory.after.MangoJuice;
import designpatterns.factory.after.WatermelonJuice;

// Simple factory pattern
// 무엇을 인자로 주느냐에 따라 달라진다.
public class SimpleFactory {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.createProduct("Mango"));
        System.out.println(factory.createProduct("Watermelon"));
    }

    public Object createProduct(String name) {
        if (name.equalsIgnoreCase("Mango")) {
            return new MangoJuice();
        } else if (name.equalsIgnoreCase("Watermelon")) {
            return new WatermelonJuice();
        } else {
            throw new IllegalArgumentException();
        }
    }

}
