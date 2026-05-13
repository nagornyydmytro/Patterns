package L19_Mememto.L19E1;

public class Client {

    private static final String[] EDGES = {
            "b",
            "c",
            "a",
            "c",
            "b",
    };

    private static final float[] VALUES = {
            4,
            5,
            4,
            2,
            3,
    };

    public static void main(String[] args) {
        innerMementoDemo();
        emptyInterfaceMementoDemo();
        protectedMementoDemo();
    }

    private static void innerMementoDemo() {
        System.out.println("Memento based on inner class:");

        Triangle triangle = new Triangle(3, 3, 3);
        InnerMementoHistory history = new InnerMementoHistory();
        history.save(triangle.saveInnerMemento());

        changeTriangleAndSaveInnerHistory(triangle, history);

        triangle.restoreInnerMemento(history.getMaxSquareMemento());
        System.out.println("Max square state: " + triangle);
        System.out.println();
    }

    private static void emptyInterfaceMementoDemo() {
        System.out.println("Memento based on empty interface:");

        Triangle triangle = new Triangle(3, 3, 3);
        EmptyMementoHistory history = new EmptyMementoHistory();
        history.save(triangle.saveEmptyMemento(), triangle.square());

        changeTriangleAndSaveEmptyHistory(triangle, history);

        triangle.restoreEmptyMemento(history.getMaxSquareMemento());
        System.out.println("Max square state: " + triangle);
        System.out.println();
    }

    private static void protectedMementoDemo() {
        System.out.println("Memento with hard relations:");

        Triangle triangle = new Triangle(3, 3, 3);
        ProtectedMementoHistory history = new ProtectedMementoHistory();
        history.save(triangle.saveProtectedMemento());

        changeTriangleAndSaveProtectedHistory(triangle, history);

        triangle.restoreProtectedMemento(history.getMaxSquareMemento());
        System.out.println("Max square state: " + triangle);
    }

    private static void changeTriangleAndSaveInnerHistory(Triangle triangle, InnerMementoHistory history) {
        for (int index = 0; index < EDGES.length; index++) {
            changeTriangle(triangle, EDGES[index], VALUES[index]);
            history.save(triangle.saveInnerMemento());
            System.out.println(triangle);
        }
    }

    private static void changeTriangleAndSaveEmptyHistory(Triangle triangle, EmptyMementoHistory history) {
        for (int index = 0; index < EDGES.length; index++) {
            changeTriangle(triangle, EDGES[index], VALUES[index]);
            history.save(triangle.saveEmptyMemento(), triangle.square());
            System.out.println(triangle);
        }
    }

    private static void changeTriangleAndSaveProtectedHistory(Triangle triangle, ProtectedMementoHistory history) {
        for (int index = 0; index < EDGES.length; index++) {
            changeTriangle(triangle, EDGES[index], VALUES[index]);
            history.save(triangle.saveProtectedMemento());
            System.out.println(triangle);
        }
    }

    private static void changeTriangle(Triangle triangle, String edge, float value) {
        switch (edge) {
            case "a":
                triangle.setA(value);
                break;
            case "b":
                triangle.setB(value);
                break;
            case "c":
                triangle.setC(value);
                break;
        }
    }
}