package designpatterns.builder.before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("홍천 계곡 나들이");
        shortTrip.setStartDate(LocalDate.of(2022, 8, 13));
        System.out.println(shortTrip);

        // 장황하게 객체를 만들게 됨
        // 생성자를 여러 개 만들게 됨
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("제주 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2022, 9, 15));
        tourPlan.setWhereToStay("Airbnb");
        tourPlan.addPlan(0, "체크인 후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "아침 백반");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "푸릉마을 세트장 체험");
        tourPlan.addPlan(1, "근처에서 랜덤으로 점심식사");
        tourPlan.addPlan(1, "저녁은 흑돼지 바베큐");
        tourPlan.addPlan(2, "전복미역국으로 아침");
        tourPlan.addPlan(2, "체크아웃");
        System.out.println(tourPlan);
    }

}
