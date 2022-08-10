package designpatterns.builder.example;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        // 좀 더 안전하게 URI 생성 가능
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.2dam0.com")
                .path("lets-build-up to next")
                .build()
                .encode();
        System.out.println(howToStudyJava);
    }

}
