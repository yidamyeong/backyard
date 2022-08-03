package designpatterns.factory.after_abstract;

public interface JuiceFactory {

    default Juice orderJuice(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Juice juice = createJuice();
        sendEmailTo(email, juice);
        return juice;
    }

    // Abstract methods
    void validate(String name, String email);

    void prepareFor(String name);

    Juice createJuice();

    void sendEmailTo(String email, Juice juice);

}
