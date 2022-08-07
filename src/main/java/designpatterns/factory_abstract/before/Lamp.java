package designpatterns.factory_abstract.before;

import designpatterns.factory_abstract.after.Bulb;
import designpatterns.factory_abstract.after.Shade;

public class Lamp {

    private String name;
    private String color;
    private String logo;
    private Bulb bulb;  // 처음엔 리턴객체가 WhiteBulb/YellowBulb 같이 구체적이었음 --> 인터페이스로 만들어줌
    private Shade shade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Object getBulb() {
        return bulb;
    }

    public void setBulb(Bulb bulb) {
        this.bulb = bulb;
    }

    public Object getShade() {
        return shade;
    }

    public void setShade(Shade shade) {
        this.shade = shade;
    }

    @Override
    public String toString() {
        return "Lamp {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                ", bulb=" + bulb +
                ", shade=" + shade +
                '}';
    }

}
