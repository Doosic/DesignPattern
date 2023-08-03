package factory.ship;

public class Client {

  public static void main(String[] args) {
    Client client = new Client();
    client.print(new WhiteShipFactory(), "whiteship", "grande@naver.com");
    client.print(new BlackShipFactory(), "blackship", "ariana@naver.com");
  }

  private void print(ShipFactory shipFactory, String name, String email) {
    System.out.println(shipFactory.orderShip(name, email));
  }
}
