import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

//  Test for lesson 3 ex 2
    @Test
    public void searchFieldContainsText()
    {
        assertElementHasText(By.xpath("//*[contains(@text, 'Search Wikipedia')]"), "There is no such text", "Search Wikipedia");
    }
//  Method for lesson 3 ex 2
    private boolean assertElementHasText(By by, String error_message, String expected_text)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.withMessage(error_message + "\n");
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(by, expected_text));
    }
/*    @Test
    public void firstTest()
    {
        waitForElementAndClick(By.xpath("//*[contains(@text, 'Search Wikipedia')]"), "Can't find Search field", 5);
        waitForElementAndSendKeys(By.xpath("//*[contains(@text, 'Search…')]"), "JAVA", "Can't find Search unput", 5);
        waitForElementPresent(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Object-oriented programming language']"), "Cannot find any shit", 15);

    }

    @Test
    public void testCancelSearch()
    {
        waitForElementAndClick(By.id( "org.wikipedia:id/search_container"), "Can't find search Wiki input", 5);
        waitForElementAndSendKeys(By.xpath("//*[contains(@text, 'Search…')]"), "JAVA", "Can't find Search unput", 5);
        waitForElementAndClear(By.id("org.wikipedia:id/search_src_text"), "Can't find input", 5);
        waitForElementAndClick(By.id("org.wikipedia:id/search_close_btn"), "Can't find close button", 5);
        waitForElementNotPresent(By.id("org.wikipedia:id/search_close_btn") , "X still present", 5);
    }
       
    @Test
    public void testCompareArticleTitle()
    {
        waitForElementAndClick(By.xpath("//*[contains(@text, 'Search Wikipedia')]"), "Can't find Search field", 5);
        waitForElementAndSendKeys(By.xpath("//*[contains(@text, 'Search…')]"), "JAVA", "Can't find Search unput", 5);
        waitForElementAndClick(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Object-oriented programming language']"), "No such article", 5);
//        Сохраняем заголовок
        WebElement title_element = waitForElementPresent(By.id("org.wikipedia:id/view_page_title_text"), "Can't find article title", 15);
        String article_title = title_element.getAttribute("text");

        Assert.assertEquals(
                "We see unexpected title!",
                "Java (programming language)",
                article_title
        );
    }

//    Метод позволяет ожидать появления элемента по xpath, показывать ошибку в случае ненахождения error_message, ждёт появления элемента определённое время timeoutInSeconds
    private WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

//  Перегрузка метода waitForElementPresentByXpath
    private WebElement waitForElementPresent(By by, String error_message)
    {
        return waitForElementPresent(by, error_message, 10);
    }

//  Ждём элемент и тыкаем на него
    private WebElement waitForElementAndClick(By by, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.click();
        return element;
    }

//  Ждём элемент и печатаем в нём
    private WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.sendKeys(value);
        return element;
    }

    private boolean waitForElementNotPresent(By by, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(by)
        );
    }

    private WebElement waitForElementAndClear(By by, String error_message, long timeoutInSeconds)
    {
        WebElement element= waitForElementPresent(by, error_message, timeoutInSeconds);
        element.clear();
        return element;
    }
*/
}
