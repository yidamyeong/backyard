package designpatterns.factory.before;

import java.util.Locale;

public class JuiceFactory {

    public static Juice orderJuice(String name, String email) {
        // validate
        // isBlank() 는 11부터 등장하여 대신 isEmpty() 응용
        if (name == null || name.replaceAll(" ", "").isEmpty()) {
            throw new IllegalArgumentException("PLEASE SET NAME OF THE JUICE");
        }
        if (email == null || email.replaceAll(" ", "").isEmpty()) {
            throw new IllegalArgumentException("PLEASE LEAVE YOUR EMAIL");
        }

        prepareFor(name);

        Juice juice = new Juice();
        juice.setName(name);

        // Customizing for specific name
        // Setting logo
        if (name.equalsIgnoreCase("mango")) {
            juice.setLogo("\uD83E\uDD6D");
        } else if (name.equalsIgnoreCase("watermelon")) {
            juice.setLogo("\uD83C\uDF49");
        }
        /*
        🥭 망고
        유니코드: U+1F96D, UTF-8: F0 9F A5 AD
        🍉 수박
        유니코드: U+1F349, UTF-8: F0 9F 8D 89
         */

        // Setting color
        if (name.equalsIgnoreCase("mango")) {
            juice.setColor("yellowgreen");
        } else if (name.equalsIgnoreCase("watermelon")) {
            juice.setColor("red");
        }

        // Notify
        sendEmailTo(email, juice);

        return juice;
    }

    private static void prepareFor(String name) {
        System.out.println(name.toUpperCase(Locale.ROOT) + " IS ON THE PROCESS NOW");
    }

    private static void sendEmailTo(String email, Juice juice) {
        System.out.println(juice.getName().toUpperCase(Locale.ROOT) + " IS READY");
    }

}
