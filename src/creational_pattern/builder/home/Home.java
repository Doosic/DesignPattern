package creational_pattern.builder.home;

public class Home {

    private int walls;
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasHeating;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasGarden;

    public Home(int walls, int windows, int doors, int rooms) {
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
    }

    public Home(int walls, int windows, int doors, int rooms, boolean hasHeating) {
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.hasHeating = hasHeating;
    }

    public Home(int walls, int windows, int doors, int rooms, boolean hasHeating, boolean hasGarage) {
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.hasHeating = hasHeating;
        this.hasGarage = hasGarage;
    }




    //    public Home(int walls, int windows, int doors, int rooms, boolean hasHeating, boolean hasGarage, boolean hasSwimPool, boolean hasGarden) {
//        this.walls = walls;
//        this.windows = windows;
//        this.doors = doors;
//        this.rooms = rooms;
//        this.hasHeating = hasHeating;
//        this.hasGarage = hasGarage;
//        this.hasSwimPool = hasSwimPool;
//        this.hasGarden = hasGarden;
//    }
}
