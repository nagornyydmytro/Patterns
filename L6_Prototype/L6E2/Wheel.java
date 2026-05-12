package L6_Prototype.L6E2;

public class Wheel {
    public enum Material {  // Матеріал диску
        Steel,  //  Стальний диск
        Alloy,  //  Легкосплавний
        Forged  //  Кований легкосплавний диск
    }

    final private Material material;   // Матеріал диску
    final int diameter;                //  Діаметр колеса

    public Wheel(Material material,
                 int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    public Wheel(Wheel other) {
        this.material = other.material;
        this.diameter = other.diameter;
    }

    public Wheel cloneWheel() {
        return new Wheel(this);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                '}';
    }
}