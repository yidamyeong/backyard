package designpatterns.factory.example;

import java.util.Calendar;
import java.util.Locale;

// Simple factory pattern
public class CalendarExample {

    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());  // 태국
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());  // 일본
    }

}
