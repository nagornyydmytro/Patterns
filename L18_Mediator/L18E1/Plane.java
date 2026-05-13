package L18_Mediator.L18E1;

/**
 * Літак
 */
public class Plane {

  /**
   * Чи злетів літак
   */
  private boolean isInTheAir;

  /**
   * Ідентифікатор літака
   */
  private int id;

  /**
   * Посередник керування польотами
   */
  private FlightMediator mediator;


  public Plane(int id, FlightMediator mediator) {
    this.id = id;
    this.mediator = mediator;
    isInTheAir = false;
    mediator.registerPlane(this);
  }

  /**
   * Зліт літака
   */
  public void takeOff() {
    mediator.takeOff(this);
  }

  /**
   * Посадка літака
   */
  public void land() {
    mediator.land(this);
  }

  /**
   * Повертає ознаку чи літак в повітрі
   * @return стан літака - чи в повітрі
   */
  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  /**
   * Встановити ознаку чи злетів літак
   * @param isInTheAir чи злетів літак
   */
  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  /**
   * Ідентифікатор літака
   * @return ідентифікатор
   */
  public int getId() {
    return id;
  }
}