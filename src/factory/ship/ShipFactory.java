package factory.ship;

public interface ShipFactory {

  default Ship orderShip(String name, String email){
    // 공통적으로 처리하는 로직은 orderShip 에 두고 상세구현이 필요한 부분들에 한해 하위 클래스들에게 구현을 넘긴다.
    validate(name, email);

    prepareFor(name);

    Ship ship = createShip();

    sendEmailTo(email, ship);
    return ship;
  }

  private void sendEmailTo(String email, Ship ship){
    System.out.println(ship.getName() + " 다 만들었습니다.");
  };

  Ship createShip();

  private void validate(String name, String email){
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("배 이름을 지어주세요.");
    }
    if (email == null || email.isBlank()) {
      throw new IllegalArgumentException("연락처를 남겨주세요.");
    }
  }

  private static void prepareFor(String name){
    System.out.println(name + " 만들 준비중");
  }

}
