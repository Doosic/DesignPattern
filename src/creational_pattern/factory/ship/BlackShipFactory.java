package creational_pattern.factory.ship;

public class BlackShipFactory implements ShipFactory{
  @Override
  public Ship createShip() {
    return new BlackShip();
  }
}
