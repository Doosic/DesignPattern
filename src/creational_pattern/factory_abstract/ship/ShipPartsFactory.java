package creational_pattern.factory_abstract.ship;

public interface ShipPartsFactory {

  Anchor createAnchor();

  Wheel createWheel();
}
