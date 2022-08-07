package designpatterns.factory_abstract.example;

import designpatterns.factory_abstract.before.Lamp;
import org.springframework.beans.factory.FactoryBean;

public class LampFactory implements FactoryBean<Lamp> {

    @Override
    public Lamp getObject() throws Exception {
        Lamp lamp = new Lamp();
        lamp.setName("TableLamp");
        return lamp;
    }

    @Override
    public Class<?> getObjectType() {
        return Lamp.class;
    }

}
