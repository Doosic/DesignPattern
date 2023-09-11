package creational_pattern.builder.home;

public class VintageHomeBuilder implements HomeBuilder{

  private int walls;
  private int windows;
  private int doors;
  private int rooms;
  private boolean hasHeating;
  private boolean hasGarage;
  private boolean hasSwimPool;
  private boolean hasGarden;

  @Override
  public HomeBuilder walls(int walls) {
    this.walls = walls;
    return this;
  }

  @Override
  public HomeBuilder windows(int windows) {
    this.windows = windows;
    return this;
  }

  @Override
  public HomeBuilder doors(int doors) {
    this.doors = doors;
    return this;
  }

  @Override
  public HomeBuilder rooms(int rooms) {
    this.rooms = rooms;
    return this;
  }

  @Override
  public HomeBuilder hasHeating(boolean hasHeating) {
    this.hasHeating = hasHeating;
    return this;
  }

  @Override
  public HomeBuilder hasGarage(boolean hasGarage) {
    this.hasGarage = hasGarage;
    return this;
  }

  @Override
  public HomeBuilder hasSwimPool(boolean hasSwimPool) {
    this.hasSwimPool = hasSwimPool;
    return this;
  }

  @Override
  public HomeBuilder hasGarden(boolean hasGarden) {
    this.hasGarden = hasGarden;
    return this;
  }

  @Override
  public Home build() {
    Home home = new Home();
    home.setWalls(this.walls);
    home.setRooms(this.rooms);
    home.setWindows(this.windows);
    home.setDoors(this.doors);
    home.setHasGarden(this.hasGarden);
    home.setHasGarage(this.hasGarage);
    home.setHasSwimPool(this.hasSwimPool);
    home.setHasHeating(this.hasHeating);
    return home;
  }
}
