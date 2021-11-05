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
    @Test
    public void testGetClassNumber()
    {
        int classNumber = getClass_number();
        int number = 45;

        Assert.assertTrue("class number less or equal than 45",classNumber > number);
    }
}
