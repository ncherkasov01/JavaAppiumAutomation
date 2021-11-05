import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int localNumber = getLocalNumber();
        int number = 14;

        Assert.assertTrue("wrong local number", localNumber == number);
    }
}
