package designpatterns.builder.after;

import designpatterns.builder.before.DetailPlan;
import designpatterns.builder.before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourInstanceBuilder implements TourPlanInstanceBuilder {

    private TourPlan tourPlan;

    @Override
    public TourPlanInstanceBuilder newInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanInstanceBuilder nightsAndDays(int nights, int days) {
        this.tourPlan.setNights(nights);
        this.tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanInstanceBuilder title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanInstanceBuilder startDate(LocalDate startDate) {
        this.tourPlan.setStartDate(startDate);
        return this;
    }

    @Override
    public TourPlanInstanceBuilder whereToStay(String whereToStay) {
        this.tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanInstanceBuilder addPlan(int day, String plan) {
        if (this.tourPlan.getPlans() == null) {
            this.tourPlan.setPlans(new ArrayList<>());
        }

        this.tourPlan.getPlans().add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return this.tourPlan;
    }

}
