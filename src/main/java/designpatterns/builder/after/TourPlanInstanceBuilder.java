package designpatterns.builder.after;

import designpatterns.builder.before.TourPlan;

import java.time.LocalDate;

public interface TourPlanInstanceBuilder {

    TourPlanInstanceBuilder newInstance();

    TourPlanInstanceBuilder nightsAndDays(int nights, int days);

    TourPlanInstanceBuilder title(String title);

    TourPlanInstanceBuilder startDate(LocalDate localDate);

    TourPlanInstanceBuilder whereToStay(String whereToStay);

    TourPlanInstanceBuilder addPlan(int day, String plan);

    TourPlan getPlan();

}
