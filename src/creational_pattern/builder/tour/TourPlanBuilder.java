package creational_pattern.builder.tour;

import java.time.LocalDate;

public interface TourPlanBuilder {

    // builder를 통해 메서드 체이닝 하기위해 이렇게 정의하는 것이다.

    TourPlanBuilder title(String title);

    TourPlanBuilder nightAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();
}
