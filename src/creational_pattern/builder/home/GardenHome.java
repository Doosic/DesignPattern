package creational_pattern.builder.home;

public class GardenHome extends Home{

    private boolean hasGarden;


    public GardenHome(int walls, int windows, int doors, int rooms, boolean hasSwimPool) {
        super(walls, windows, doors, rooms);
        this.hasGarden = hasGarden;
    }
}
