import org.junit.Test;

public class NetworkUtilsTest {

    @Test(timeout = 1000) // тест будет завален потому что тестовый сценарий исполняется дольше 1 секунды
    public void getConnectionShouldReturnFasterThanOneSecond() {
        NetworkUtils.getConnection();
    }
}
