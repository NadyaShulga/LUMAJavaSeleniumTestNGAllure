import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestTest {
    @Test
    public void testPass(){

        Assert.assertTrue(true);

    }

    @Test
    public void testFail(){

        Assert.assertTrue(false);

    }
}
