package designpatterns.factory_abstract.after;

import designpatterns.factory_abstract.before.Lamp;
import designpatterns.factory_abstract.before.LampFactory;

public class LampInventory {

    public static void main(String[] args) {
        LampFactory lampProFactory = new TableLampFactory(new TableLampPartsProFactory());
        Lamp lampPro = lampProFactory.createLamp();

        System.out.println(lampPro.getBulb().getClass());
        System.out.println(lampPro.getShade().getClass());

        LampFactory lampFactory = new TableLampFactory(new TableLampPartsFactory());
        Lamp lamp = lampFactory.createLamp();

        System.out.println(lamp.getBulb().getClass());
        System.out.println(lamp.getShade().getClass());
    }

}
