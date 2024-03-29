package creational_pattern.factory_abstract.ship;

public class WhiteshipPartsFactory implements ShipPartsFactory{

  @Override
  public Anchor createAnchor() {
    return new WhiteAnchor();
  }

  @Override
  public Wheel createWheel() {
    return new WhiteWheel();
  }
}
