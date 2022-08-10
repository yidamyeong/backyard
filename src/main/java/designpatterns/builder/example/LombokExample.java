package designpatterns.builder.example;

import lombok.Builder;

@Builder
public class LombokExample {

    private String title;

    private int nights;

    private int days;

    public static void main(String[] args) {
        LombokExample trip = LombokExample.builder()
                .title("trip")
                .nights(2)
                .days(3)
                .build();
        System.out.println(trip);
    }

    @Override
    public String toString() {
        return "LombokExample {" +
                "title='" + title + '\'' +
                ", nights=" + nights +
                ", days=" + days +
                '}';
    }

}
