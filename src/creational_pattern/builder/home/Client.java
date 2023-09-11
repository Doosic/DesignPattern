package creational_pattern.builder.home;

public class Client {

    public static void main(String[] args) {
        HomeDirector defaultHomeDirector = new HomeDirector(new DefaultHomeBuilder());
        System.out.println(defaultHomeDirector.hasGardenHome());

        HomeDirector modernHomeDirector = new HomeDirector(new ModernHomeBuilder());
        System.out.println(modernHomeDirector.hasHeatingHome());

        HomeDirector vintageHomeDirector = new HomeDirector(new VintageHomeBuilder());
        System.out.println(vintageHomeDirector.hasSwimPoolHome());
    }
}
