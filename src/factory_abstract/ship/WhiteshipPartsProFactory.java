package factory_abstract.ship;

public class WhiteshipPartsProFactory implements ShipPartsFactory{
  @Override
  public Anchor createAnchor() {
    return new WhiteAnchorPro();
  }

  @Override
  public Wheel createWheel() {
    return new WhiteWheelPro();
  }
}
