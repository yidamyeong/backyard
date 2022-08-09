package designpatterns.builder.after;

import designpatterns.builder.before.TourPlan;

import java.time.LocalDate;

public class TourInstanceDirector {

    private TourPlanInstanceBuilder tourPlanInstanceBuilder;

    public TourInstanceDirector(TourPlanInstanceBuilder tourPlanInstanceBuilder) {
        this.tourPlanInstanceBuilder = tourPlanInstanceBuilder;
    }

    public TourPlan jejuTrip() {
        return tourPlanInstanceBuilder.newInstance()
                .title("제주 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 9, 15))
                .whereToStay("Airbnb")
                .addPlan(0, "체크인 후 짐풀기")
                .addPlan(0, "저녁 식사")
                .addPlan(1, "아침 백반")
                .addPlan(1, "해변가 산책")
                .addPlan(1, "푸릉마을 세트장 체험")
                .addPlan(1, "근처에서 랜덤으로 점심식사")
                .addPlan(1, "저녁은 흑돼지 바베큐")
                .addPlan(2, "전복미역국으로 아침")
                .addPlan(2, "체크아웃")
                .getPlan();
    }

    public TourPlan valleyTrip() {
        return tourPlanInstanceBuilder.newInstance()
                .title("홍천 계곡 나들이")
                .startDate(LocalDate.of(2022, 8, 13))
                .getPlan();
    }

}
