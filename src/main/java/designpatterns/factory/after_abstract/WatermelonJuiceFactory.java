package designpatterns.factory.after_abstract;

public class WatermelonJuiceFactory extends DefaultJuiceFactory {

    @Override
    public Juice createJuice() {
        return new WatermelonJuice();
    }

}
