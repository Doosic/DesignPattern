package creational_pattern.builder.home;

public class HomeDirector {

  private HomeBuilder homeBuilder;

  public HomeDirector(HomeBuilder homeBuilder){
    this.homeBuilder = homeBuilder;
  }

  public Home hasGardenDefaultHome(){
    return homeBuilder
        .hasGarden(true)
        .hasSwimPool(false)
        .hasGarage(false)
        .hasHeating(false)
        .doors(5)
        .rooms(3)
        .windows(8)
        .walls(4)
        .build();
  }


  public Home hasGardenModernHome(){
    return homeBuilder
        .hasHeating(true)
        .hasSwimPool(false)
        .hasGarden(false)
        .hasGarage(false)
        .doors(3)
        .rooms(3)
        .windows(12)
        .walls(4)
        .build();
  }

  public Home hasGardenVintageHome(){
    return homeBuilder
        .hasHeating(true)
        .hasSwimPool(false)
        .hasGarden(false)
        .hasGarage(false)
        .doors(3)
        .rooms(3)
        .windows(12)
        .walls(4)
        .build();
  }
}
