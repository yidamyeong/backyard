package designpatterns.factory_abstract.before;

public class FloorLampFactory extends DefaultLampFactory {

    @Override
    public Lamp createLamp() {
        Lamp lamp = new Lamp();
        // 구체적인 클래스 타입에 의존
        lamp.setBulb(new YellowBulb());
        lamp.setShade(new YellowShade());
        return lamp;
    }

}
