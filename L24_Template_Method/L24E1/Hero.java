package L24_Template_Method.L24E1;

public abstract class Hero {

    public final void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }

    protected abstract void pickUpWeapon();

    protected abstract void defenseAction();

    protected abstract void moveToSafety();

}