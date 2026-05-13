package L18_Mediator.L18E1;

public class ControlTower implements FlightMediator {

    private final Runway runway;
    private final PlanesInFlight planesInFlight;
    private final PlanesOnGround planesOnGround;

    public ControlTower(Runway runway, PlanesInFlight planesInFlight, PlanesOnGround planesOnGround) {
        this.runway = runway;
        this.planesInFlight = planesInFlight;
        this.planesOnGround = planesOnGround;
    }

    @Override
    public void registerPlane(Plane plane) {
        planesOnGround.addPlane(plane);
        System.out.println("Plane " + plane.getId() + " registered on ground");
    }

    @Override
    public void takeOff(Plane plane) {
        if (plane.getIsInTheAir()) {
            System.out.println("Plane " + plane.getId() + " is already in the air");
            return;
        }

        if (!runway.getIsAvailable()) {
            System.out.println("Plane " + plane.getId() + " cannot take off. Runway is busy");
            return;
        }

        System.out.println("Plane " + plane.getId() + " is taking off...");
        planesOnGround.removePlane(plane);
        planesInFlight.addPlane(plane);
        plane.setIsInTheAir(true);
        runway.setIsAvailable(false);
    }

    @Override
    public void land(Plane plane) {
        if (!plane.getIsInTheAir()) {
            System.out.println("Plane " + plane.getId() + " is already on the ground");
            return;
        }

        System.out.println("Plane " + plane.getId() + " is landing...");
        planesInFlight.removePlane(plane);
        planesOnGround.addPlane(plane);
        plane.setIsInTheAir(false);
        runway.setIsAvailable(true);
    }
}