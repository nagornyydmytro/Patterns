package L5_Builder.L5E1.src;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car sedan = director.buildSedan();
        Car suv = director.buildSUV();
        Car hatchback = director.buildHatchback();

        System.out.println(sedan);
        System.out.println(suv);
        System.out.println(hatchback);
    }
}
