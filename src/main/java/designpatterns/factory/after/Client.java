package designpatterns.factory.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new MangoJuiceFactory(), "Mango", "yidamyeong@gmail.com");
        client.print(new WatermelonJuiceFactory(), "Watermelon", "yidamyeong@gmail.com");

        // 구체적인 클래스가 생길 수록 Client Class 는 변경 여지가 분명 있다.
        // 따라서 위처럼 인터페이스 기반으로 설계해야함
        Juice mangoJuice = new MangoJuiceFactory().orderJuice("Mango", "yidamyeong@gmail.com");
        System.out.println(mangoJuice + "\n");

        Juice watermelonJuice = new WatermelonJuiceFactory().orderJuice("Watermelon", "yidamyeong@gmail.com");
        System.out.println(watermelonJuice);
    }

    // interface 기반
    private void print(JuiceFactory juiceFactory, String name, String email) {
        System.out.println(juiceFactory.orderJuice(name, email));
        System.out.println();
    }

}
