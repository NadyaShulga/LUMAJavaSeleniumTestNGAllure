import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.Assert;

public class FrameworkTest {
    @Test
    public void testPass(){

        Assert.assertTrue(true);

    }
    @Ignore
    @Test
    public void testFail(){

        Assert.assertTrue(false);

    }
}
