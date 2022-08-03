package designpatterns.factory.before;

public class Client {

    public static void main(String[] args) {
        // 요구하는 상품이 다분화되면서 JuiceFactory 는 물론 Juice 내부 필드도 변경될 수 있다.
        // 이는 Open-closed principle 에 위반된다. (확장에 열리되 변경에는 닫혀야 하는)
        // 기존 코드를 변경하지 않고 새로운 라인의 공정을 추가할 수 있어야 한다.

        Juice mangoJuice = JuiceFactory.orderJuice("Mango", "yidamyeong@gmail.com");
        System.out.println(mangoJuice + "\n");

        Juice watermelonJuice = JuiceFactory.orderJuice("Watermelon", "yidamyeong@gmail.com");
        System.out.println(watermelonJuice);
    }

}
