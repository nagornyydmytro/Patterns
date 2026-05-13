package L23_Visitor.L23E2;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        final List<MilitaryObject> militaryObjects = new ArrayList<>();

        militaryObjects.add(new GeneralStaff(20, 100));
        militaryObjects.add(new MilitaryBase(10, 1000, 300, 20));

        System.out.println("Initial state:");
        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

        Spy secretAgent = new SecretAgent();

        System.out.println();
        System.out.println("Secret agent visit:");
        for (MilitaryObject military : militaryObjects) {
            military.accept(secretAgent);
        }

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

        Spy saboteur = new Saboteur();

        System.out.println();
        System.out.println("Saboteur visit:");
        for (MilitaryObject military : militaryObjects) {
            military.accept(saboteur);
        }

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }
    }

}