package creational_pattern.builder.home;

public class Home {

    private String name;
    private int walls;
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasHeating;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasGarden;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isHasHeating() {
        return hasHeating;
    }

    public void setHasHeating(boolean hasHeating) {
        this.hasHeating = hasHeating;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasSwimPool() {
        return hasSwimPool;
    }

    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "Home{" +
            "name='" + name + '\'' +
            ", walls=" + walls +
            ", windows=" + windows +
            ", doors=" + doors +
            ", rooms=" + rooms +
            ", hasHeating=" + hasHeating +
            ", hasGarage=" + hasGarage +
            ", hasSwimPool=" + hasSwimPool +
            ", hasGarden=" + hasGarden +
            '}';
    }
}
