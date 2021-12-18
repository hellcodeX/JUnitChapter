import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {
    public static final double EPS = 1e-9;

    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2D v1 = new Vector2D(); // action

        // assertion
        // аргументы: ожидаемое значение, получаемое значение, точность с которой ожидаемый и
        // фактический результат должен совпадать
        Assert.assertEquals(0, v1.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D v1 = new Vector2D(); // action

        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Vector2D v1 = new Vector2D(); // action

        Assert.assertEquals(0, v1.getY(), EPS);
    }
}
