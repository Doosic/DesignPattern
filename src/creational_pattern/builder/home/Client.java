package creational_pattern.builder.home;

public class Client {

    public static void main(String[] args) {
        HomeDirector director = new HomeDirector(new DefaultHomeBuilder());

        System.out.println(director.hasGardenHome());
        System.out.println(director.hasSwimPoolHome());
        System.out.println(director.hasHeatingHome());
    }
}
