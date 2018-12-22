public class Calculator {

    public int addition(int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        long result = (long) x - (long) y;
        return (int) result;
    }

    public int multiplication(int x, int y) {
        long result = (long) x * (long) y;
        return (int) result;
    }

}
