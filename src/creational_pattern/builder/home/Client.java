package creational_pattern.builder.home;

public class Client {

    public static void main(String[] args) {
        HomeDirector defaultHomeDirector = new HomeDirector(new DefaultHomeBuilder());
        System.out.println(defaultHomeDirector.hasGardenDefaultHome());

        HomeDirector modernHomeDirector = new HomeDirector(new ModernHomeBuilder());
        System.out.println(modernHomeDirector.hasGardenDefaultHome());

        HomeDirector vintageHomeDirector = new HomeDirector(new VintageHomeBuilder());
        System.out.println(vintageHomeDirector.hasGardenVintageHome());
    }
}
