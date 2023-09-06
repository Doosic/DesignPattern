package creational_pattern.builder.tour;

public class Client {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());


        System.out.println(director.cancunTrip());
    }
}
