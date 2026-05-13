package L24_Template_Method.L24E1;

/**
 * Пірат
 */
public class Pirate extends Hero {

  /**
   * Підняти зброю для захисту - оголити меч
   */
  @Override
  protected void pickUpWeapon() {
    System.out.println("Pick up sword");
  }

  /**
   * Захист
   */
  @Override
  protected void defenseAction() {
    System.out.println("Defend with sword");
  }

  /**
   * Повернення героя в безпечне місце
   */
  @Override
  protected void moveToSafety() {
    System.out.println("Return to the ship");
  }

}