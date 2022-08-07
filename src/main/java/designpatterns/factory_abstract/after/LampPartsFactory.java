package designpatterns.factory_abstract.after;

// 추상팩토리 패턴
public interface LampPartsFactory {

    Bulb createBulb();

    Shade createShade();

}
