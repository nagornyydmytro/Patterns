package L18_Mediator.L18E1;

public interface FlightMediator {
    void registerPlane(Plane plane);
    void takeOff(Plane plane);
    void land(Plane plane);
}