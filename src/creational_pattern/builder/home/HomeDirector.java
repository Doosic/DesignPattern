package creational_pattern.builder.home;

public class HomeDirector {

  private HomeBuilder homeBuilder;

  public HomeDirector(HomeBuilder homeBuilder){
    this.homeBuilder = homeBuilder;
  }


  public Home hasGardenHome(){
    return homeBuilder
        .hasGarden(true)
        .name("정원이 있는 집")
        .doors(5)
        .rooms(3)
        .windows(8)
        .walls(4)
        .build();
  }


  public Home hasHeatingHome(){
    return homeBuilder
        .hasHeating(true)
        .name("난방기가 있는 따뜻한 집")
        .doors(3)
        .rooms(3)
        .windows(12)
        .walls(4)
        .build();
  }

  public Home hasSwimPoolHome(){
    return homeBuilder
        .hasSwimPool(true)
        .name("수영장이 있는 집")
        .doors(3)
        .rooms(3)
        .windows(12)
        .walls(4)
        .build();
  }
}
