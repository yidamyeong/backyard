package designpatterns.builder.example;

import java.util.stream.Stream;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder
                .append("dam")
                .append("yeong ")
                .append("the ")
                .append("great")
                .toString();
        System.out.println(result);

        Stream<String> names = Stream.<String>builder()
                .add("Alalouch")
                .add("Mohamad")
                .build();
        names.forEach(System.out::println);
    }

}
