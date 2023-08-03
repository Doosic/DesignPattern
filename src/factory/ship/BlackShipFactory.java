package factory.ship;

public class BlackShipFactory implements ShipFactory{
  @Override
  public Ship createShip() {
    return new BlackShip();
  }
}