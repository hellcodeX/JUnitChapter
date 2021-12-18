import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DUpgradedTest {
    public static final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createNewVector() {
        // если объект не различается для каждого тестового метода, можно использовать @BeforeClass
        v1 = new Vector2D();
    }

//    @Before
//    public void createNewVector() {
//        // если объект не различается для каждого тестового метода, можно использовать @BeforeClass
//        v1 = new Vector2D();
//    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        Assert.assertEquals(0, v1.length(), EPS);
    }

    /* Однако если методы сложные, каждый метод нужно тестировать в отдельном тестовом методе.
    * Иначе если один из ассертов выдаст ошибку, до следующих ассертов мы просто не дойдем, и весь
    * тестовый метод завалится ошибкой.  */
//    @Test
//    public void newVectorShouldHaveZeroXAndZeroY() {
//        Assert.assertEquals(0, v1.getX(), EPS);
//        Assert.assertEquals(0, v1.getY(), EPS);
//    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Assert.assertEquals(0, v1.getY(), EPS);
    }
}
