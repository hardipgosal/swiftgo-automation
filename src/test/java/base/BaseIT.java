package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseIT {

    private WebDriver driver;
    private final String BaseURL = "https://www.swiftgo.co.uk/";


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BaseURL);

        //Maximize the window
        driver.manage().window().maximize();

        driver.quit();
    }

    public static void main(String[] args) {
        BaseIT test = new BaseIT();
        test.setUp();
    }
}