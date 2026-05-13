package L19_Mememto.L19E2;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        CommandHistory history = new CommandHistory(triangle);
        history.save();

        Command[] commands = {
                () -> triangle.setB(4),
                () -> triangle.setC(5),
                () -> triangle.setA(4),
                triangle::duplicateA,
                () -> triangle.setC(6),
                () -> triangle.setB(3),
                triangle::halfA
        };

        for (Command command : commands) {
            history.execute(command);
            System.out.println(triangle);
        }

        triangle.restore(history.getMinSquareMemento());
        System.out.println("Min square state: " + triangle);
    }
}