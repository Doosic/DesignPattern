package creational_pattern.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());


        System.out.println(director.cancunTrip());
    }
}
