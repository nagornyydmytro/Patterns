package L18_Mediator.L18E1;

public class Main {

  public static void main(String[] args) {
    Runway runway = new Runway();
    PlanesInFlight planesInFlight = new PlanesInFlight();
    PlanesOnGround planesOnGround = new PlanesOnGround();

    FlightMediator controlTower = new ControlTower(runway, planesInFlight, planesOnGround);

    Plane plane1 = new Plane(123, controlTower);
    Plane plane2 = new Plane(456, controlTower);

    plane1.takeOff();
    plane2.takeOff();
    plane1.land();
    plane2.takeOff();
  }

}