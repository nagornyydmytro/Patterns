package L7_Singleton.L7E2;

public class Main {
    public static void main(String[] args) {
        Director director1 = Director.getInstance();
        Director director2 = Director.getInstance();

        Car sedan = director1.buildSedan();
        Car suv = director1.buildSUV();
        Car hatchback = director1.buildHatchback();

        System.out.println("Same instance: " + (director1 == director2));
        System.out.println();

        System.out.println(sedan);
        System.out.println(suv);
        System.out.println(hatchback);
    }
}