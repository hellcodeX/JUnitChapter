public class MyMath {
    public static double divide(int n1, int n2) {
        if (n2 == 0)
            throw new ArithmeticException("Can't divide by zero");

        return n1 / n2;
    }
}
