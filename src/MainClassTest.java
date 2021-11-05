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
    public void testGetClassString()
    {
        String expected = getClassString();
        String actual = "Hello";
        String actual2 = "hello";

        if (expected.contains(actual))
        {
            System.out.println("Hello is present");
        }
        else  if (expected.contains(actual2))
        {
            System.out.println("hello is present");
        }
        else
        {
            Assert.fail("There is no Hello or hello");
        }
    }

}
