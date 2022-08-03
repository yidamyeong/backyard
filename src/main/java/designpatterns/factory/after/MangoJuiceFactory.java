package designpatterns.factory.after;

public class MangoJuiceFactory implements JuiceFactory {

    @Override
    public Juice createJuice() {
        return new MangoJuice();
    }

}
