package L24_Template_Method.L24E1;

/**
 * Троль
 */
public class Troll extends Hero {

  /**
   * Підняти булаву
   */
  @Override
  protected void pickUpWeapon() {
    System.out.println("Pick up club");
  }

  /**
   * Захищатися за допомогою булави
   */
  @Override
  protected void defenseAction() {
    System.out.println("Defend with club");
  }

  /**
   * Повернутися в безпечне місце в горах
   */
  @Override
  protected void moveToSafety() {
    System.out.println("Return to the mountain");
  }

}