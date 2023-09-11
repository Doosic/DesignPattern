package creational_pattern.builder.home;

public interface HomeBuilder {

  HomeBuilder name(String name);
  HomeBuilder walls(int walls);
  HomeBuilder windows(int windows);
  HomeBuilder doors(int doors);
  HomeBuilder rooms(int rooms);
  HomeBuilder hasHeating(boolean hasHeating);
  HomeBuilder hasGarage(boolean hasGarage);
  HomeBuilder hasSwimPool(boolean hasSwimPool);
  HomeBuilder hasGarden(boolean hasGarden);
  Home build();
}
