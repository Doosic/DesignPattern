package factory_abstract.ship;

public interface ShipPartsFactory {

  Anchor createAnchor();

  Wheel createWheel();
}
