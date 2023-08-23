package factory.ship;

public class WhiteShipFactory implements ShipFactory{

  @Override
  public Ship createShip() {
    return new Whiteship();
  }
}
