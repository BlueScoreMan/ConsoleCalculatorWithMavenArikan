public class Calculator {

    public int addition(int x, int y) {
        return redirect(x, y);
    }

    public int subtraction(int x, int y) {
        long result = (long) x - (long) y;
        return (int) result;
    }

    public int multiplication(int x, int y) {
        long result = (long) x * (long) y;
        return (int) result;
    }

    protected int division(int x, int y) {
        long result = (long) x / (long) y;
        return (int) result;
    }

    private int redirect(int x, int y) {
        long result = (long) x + (long) y;
        return (int) result;
    }
}
