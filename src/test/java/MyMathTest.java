import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class) // должно вызваться это исключение
    public void checkZeroDenominatorShouldThrowException() {
        MyMath.divide(5, 0);
    }
}
