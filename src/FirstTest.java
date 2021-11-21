import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {

    private AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilitues = new DesiredCapabilities();

        capabilitues.setCapability("platformName","Android");
        capabilitues.setCapability("deviceName","AndroidTestDevice");
        capabilitues.setCapability("platformVersion","10");
        capabilitues.setCapability("automationName","Appium");
        capabilitues.setCapability("appPackage","org.wikipedia");
        capabilitues.setCapability("appActivity",".main.MainActivity");
        capabilitues.setCapability("app","/Users/ncherkasov/Desktop/JavaAppiumAutomation/apks/org.wikipedia.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilitues);
    }

    @After
    public void  tearDown()
    {
            driver.quit();
    }

    @Test
    public void firstTest()
    {
        System.out.println("First test run");
    }
}
