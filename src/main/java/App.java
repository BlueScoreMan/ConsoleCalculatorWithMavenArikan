public class App {

    private static Integer parseInput(String arg) {
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            System.err.println("Two args necessary");
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        if (args.length < 2) {
            System.err.println("Two args needed");
            throw new RuntimeException();
        }
        System.out.println("Sum of " + parseInput(args[0]) + " + " + parseInput(args[1]) + " = " + calculator.addition(parseInput(args[0]), parseInput(args[1])));
    }
}
