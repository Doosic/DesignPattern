package creational_pattern.builder.home;

public class HomeDirector {

  private HomeBuilder homeBuilder;

  public HomeDirector(HomeBuilder homeBuilder){
    this.homeBuilder = homeBuilder;
  }

  public Home hasGardenHome(){
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

  public Home hasSwimPoolHome(){
    return homeBuilder
        .hasSwimPool(true)
        .hasGarden(false)
        .hasGarage(false)
        .hasHeating(false)
        .doors(6)
        .rooms(4)
        .windows(10)
        .walls(8)
        .build();
  }

  public Home hasHeatingHome(){
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
