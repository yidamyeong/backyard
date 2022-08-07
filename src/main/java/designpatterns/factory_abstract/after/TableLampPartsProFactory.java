package designpatterns.factory_abstract.after;

public class TableLampPartsProFactory implements LampPartsFactory {

    @Override
    public Bulb createBulb() {
        return new WhiteBulbPro();
    }

    @Override
    public Shade createShade() {
        return new WhiteShadePro();
    }

}
