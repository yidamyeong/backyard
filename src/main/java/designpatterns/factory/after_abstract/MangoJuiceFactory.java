package designpatterns.factory.after_abstract;

public class MangoJuiceFactory extends DefaultJuiceFactory {

    @Override
    public Juice createJuice() {
        return new MangoJuice();
    }

}
