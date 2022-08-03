package designpatterns.factory.after;

public class WatermelonJuiceFactory implements JuiceFactory {

    @Override
    public Juice createJuice() {
        return new WatermelonJuice();
    }

}
