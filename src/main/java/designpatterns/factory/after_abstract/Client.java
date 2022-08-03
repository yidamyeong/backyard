package designpatterns.factory.after_abstract;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new MangoJuiceFactory(), "Mango", "yidamyeong@gmail.com");
        client.print(new WatermelonJuiceFactory(), "Watermelon", "yidamyeong@gmail.com");
    }

    // interface 기반
    private void print(JuiceFactory juiceFactory, String name, String email) {
        System.out.println(juiceFactory.orderJuice(name, email));
        System.out.println();
    }

}
