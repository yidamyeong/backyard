package designpatterns.factory_abstract.after;

import designpatterns.factory_abstract.before.WhiteBulb;
import designpatterns.factory_abstract.before.WhiteShade;

public class TableLampPartsFactory implements LampPartsFactory {

    @Override
    public Bulb createBulb() {
        return new WhiteBulb();
    }

    @Override
    public Shade createShade() {
        return new WhiteShade();
    }

}
