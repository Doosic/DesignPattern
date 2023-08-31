package creational_pattern.builder;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder){
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.title("칸쿤여행")
                .nightAndDays(2,3)
                .startDate(LocalDate.of(2020,12,9))
                .whereToStay("리조트")
                .addPlan(0, "ㅎㅎㅎㅎ")
                .addPlan(1, "dasd")
                .getPlan();
    }

}
