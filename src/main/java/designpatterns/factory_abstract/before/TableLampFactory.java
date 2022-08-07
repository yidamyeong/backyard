package designpatterns.factory_abstract.before;

public class TableLampFactory extends DefaultLampFactory {

    @Override
    public Lamp createLamp() {
        Lamp lamp = new Lamp();
        // 구체적인 클래스 타입에 의존
        lamp.setBulb(new WhiteBulb());
        lamp.setShade(new WhiteShade());
        return lamp;
    }

}
