package creational_pattern.builder.home;

public class SwimPoolHome extends Home{

    private boolean hasSwimPool;


    public SwimPoolHome(int walls, int windows, int doors, int rooms, boolean hasSwimPool) {
        super(walls, windows, doors, rooms);
        this.hasSwimPool = hasSwimPool;
    }
}
