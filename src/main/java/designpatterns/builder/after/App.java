package designpatterns.builder.after;

import designpatterns.builder.before.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan1 = director.jejuTrip();
        TourPlan tourPlan2 = director.valleyTrip();

        // 중복 문제 발생
        System.out.println(tourPlan1);
        System.out.println(tourPlan2);

        TourInstanceDirector instanceDirector = new TourInstanceDirector(new DefaultTourInstanceBuilder());
        TourPlan tourPlan3 = instanceDirector.jejuTrip();
        TourPlan tourPlan4 = instanceDirector.valleyTrip();

        // newInstance() 통해 중복 문제 해결
        System.out.println(tourPlan3);
        System.out.println(tourPlan4);
    }

}
