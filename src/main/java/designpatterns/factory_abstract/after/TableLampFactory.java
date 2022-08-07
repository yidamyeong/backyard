package designpatterns.factory_abstract.after;

import designpatterns.factory_abstract.before.DefaultLampFactory;
import designpatterns.factory_abstract.before.Lamp;

public class TableLampFactory extends DefaultLampFactory {

    private LampPartsFactory lampPartsFactory;

    public TableLampFactory(LampPartsFactory lampPartsFactory) {
        this.lampPartsFactory = lampPartsFactory;
    }

    @Override
    public Lamp createLamp() {
        Lamp lamp = new Lamp();

        // 추상적인 클래스에 의존하게 되어 구체적인 부품을 갈아끼울 필요가 없음
        lamp.setBulb(lampPartsFactory.createBulb());
        lamp.setShade(lampPartsFactory.createShade());
        return lamp;
    }

}
